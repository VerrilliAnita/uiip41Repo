package it.uiip.airport.core.job;

import java.util.List;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import it.uiip.airport.core.enums.TicketAirportStatusEnum;
import it.uiip.airport.core.model.FlightRouteModel;
import it.uiip.airport.core.model.TicketAirportModel;
import it.uiip.airport.core.service.RoutePlaneService;

public class RoutePlaneJob extends AbstractJobPerformable<CronJobModel> {
	
	private RoutePlaneService routePlaneService;
	
	
	@Override
	public PerformResult perform(CronJob Model) {
		
	}
	
	
	

}
