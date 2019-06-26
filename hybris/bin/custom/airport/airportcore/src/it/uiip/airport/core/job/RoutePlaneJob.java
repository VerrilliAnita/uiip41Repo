package it.uiip.airport.core.job;

import java.util.List;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import it.uiip.airport.core.enums.TicketAirportStatusEnum;
import it.uiip.airport.core.model.RouteModel;
import it.uiip.airport.core.model.TicketAirportModel;
import it.uiip.airport.core.service.RoutePlaneService;

public class RoutePlaneJob extends AbstractJobPerformable<CronJobModel> {
	
	private RoutePlaneService routePlaneService;

	

	@Override
	public PerformResult perform(CronJobModel model) {
		List <RouteModel> routes = routePlaneService.getRoutesForFlightStatus("DELETED");
		if(routes.size()>0) {
			for (RouteModel route : routes) {
				if(route.getTickets()!= null) {
					for (TicketAirportModel ticket : route.getTickets()) {
							ticket.setTicketAirportStatus(TicketAirportStatusEnum.DELETED);
							this.modelService.save(ticket);
						
					
					}	
				}
			}
		}
		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
	}
	
	public RoutePlaneService getRoutePlaneService() {
		return routePlaneService;
	}

	public void setRoutePlaneService(RoutePlaneService routePlaneService) {
		this.routePlaneService = routePlaneService;
	}

}
