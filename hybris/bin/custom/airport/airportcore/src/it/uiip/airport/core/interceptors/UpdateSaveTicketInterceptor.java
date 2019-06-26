package it.uiip.airport.core.interceptors;

import org.apache.log4j.Logger;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import it.uiip.airport.core.model.TicketAirportModel;

public class UpdateSaveTicketInterceptor implements PrepareInterceptor<TicketAirportModel>{
	
	private static final Logger LOG = Logger.getLogger(UpdateSaveTicketInterceptor.class);

	@Override
	public void onPrepare(TicketAirportModel ticket, InterceptorContext ctx) throws InterceptorException {
		
		if(ctx.getModelService().isNew(ticket)) 
		{
			
			LOG.info("New Ticket");
		}
		else if(ctx.getModelService().isUpToDate(ticket.getTicketAirportStatus()));
		{
			LOG.info("Ticket Modified ");
		}
		
		
	}



}
