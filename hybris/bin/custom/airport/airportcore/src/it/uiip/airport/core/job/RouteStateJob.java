package it.uiip.airport.core.job;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import it.uiip.airport.core.dao.impl.DefaultRouteDao;
import it.uiip.airport.core.enums.StateRoute;
import it.uiip.airport.core.enums.StateTicket;
import it.uiip.airport.core.model.RouteModel;
import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.core.service.impl.DefaultRoutePlaneService;

public class RouteStateJob extends AbstractJobPerformable<CronJobModel> {

	private DefaultRoutePlaneService routePlaneService;
	
	private static final Logger LOG = Logger.getLogger(DefaultRouteDao.class);
	
	@Override
	public PerformResult perform(CronJobModel cmodel) {
		LOG.info("Call method perform in RouteStateJob");
		List<RouteModel> routes = routePlaneService.getRoutesForState("CANCELLED");
		for(RouteModel route : routes) {
			Set<TicketModel> tickets = (Set<TicketModel>) route.getTickets();
			if(tickets != null) {
				for(TicketModel ticket : tickets) {
					ticket.setState(StateTicket.CANCELLED);
					this.modelService.save(ticket);
				}
			}
		}
		
		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
	}

	public DefaultRoutePlaneService getRoutePlaneService() {
		return routePlaneService;
	}
	
	@Required
	public void setRoutePlaneService(DefaultRoutePlaneService routePlaneService) {
		this.routePlaneService = routePlaneService;
	}
	
	

}
