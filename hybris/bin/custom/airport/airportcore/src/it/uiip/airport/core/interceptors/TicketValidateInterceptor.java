package it.uiip.airport.core.interceptors;

import org.apache.log4j.Logger;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import it.uiip.airport.core.model.TicketModel;

public class TicketValidateInterceptor implements ValidateInterceptor {
	
	private static final Logger LOG = Logger.getLogger(TicketValidateInterceptor.class);
	
	
	@Override
	public void onValidate(Object model, InterceptorContext ctx) throws InterceptorException {
		
		LOG.info("Call interceptor method --> onValidate() in TicketCreateInterceptor");
		
		if(model instanceof TicketModel && model != null) {
			TicketModel ticket = (TicketModel) model;
			int tickets = ticket.getRoute().getTickets().size();
			int numOfSits = ticket.getRoute().getFlight().getPlane().getNumOfSits();
			LOG.info("tickets: " +tickets);
			LOG.info("num of sits: " +numOfSits);
			if(tickets > numOfSits) {
				LOG.info("Tickets is more of num of sits");
				throw new InterceptorException("Number of sits sold out...");
			}
			else {
				LOG.info("Save the ticket");
			}
		}
		
	}

}
