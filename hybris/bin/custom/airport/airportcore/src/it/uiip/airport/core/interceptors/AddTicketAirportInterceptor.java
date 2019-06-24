package it.uiip.airport.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import it.uiip.airport.core.model.TicketAirportModel;

import org.apache.log4j.Logger;

public class AddTicketAirportInterceptor implements ValidateInterceptor{
	
	private static final Logger LOG = Logger.getLogger(AddTicketAirportInterceptor.class);

	@Override
	public void onValidate(Object obj, InterceptorContext ctx) throws InterceptorException {
		if (obj instanceof TicketAirportModel){
			final TicketAirportModel ticketAirportModel = (TicketAirportModel) obj;
			if (ticketAirportModel.getRoute().getFlight().getPlane().getNumOfSits()<
					ticketAirportModel.getRoute().getPassenger().size()) {
				
				LOG.info("Impossible to add Ticket");
				throw new InterceptorException("plane's seats sold-out");
			}
			else {
				LOG.info("Ticket added correctly");
				
			}
				
				
				
		}
		}


}
