package it.uiip.airport.core.job;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import it.uiip.airport.core.enums.RouteStatus;
import it.uiip.airport.core.model.RouteModel;
import it.uiip.airport.core.model.TicketModel;

import it.uiip.airport.core.service.RoutePlaneService;


public class RouteJob extends AbstractJobPerformable<CronJobModel>{
	
	
	private RoutePlaneService routePlaneService;
	
	@Override
	public PerformResult perform(CronJobModel arg0) {
		final List<RouteModel> routes = (List<RouteModel>) routePlaneService.getRouteForStatus(RouteStatus.CANCELLED.toString());
		for(RouteModel r : routes) {
			for(TicketModel t : r.getTicket()) {
				t.setStatus(RouteStatus.CANCELLED);
				this.modelService.save(t);

			}
		}
		return new PerformResult(CronJobResult.SUCCESS,CronJobStatus.FINISHED);
	}

	public RoutePlaneService getRoutePlaneService() {
		return routePlaneService;
	}
	
	@Required
	public void setRoutePlaneService(RoutePlaneService routePlaneService) {
		this.routePlaneService = routePlaneService;
	}

}
