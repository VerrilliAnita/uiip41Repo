package it.uiip.airport.core.interceptor;

import com.sun.istack.internal.logging.Logger;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

public class ValidateTicketInterceptor implements ValidateInterceptor<AirportTicketModel> {
	
	private static final Logger LOG = Logger.getLogger(ValidateTicketInterceptor.class);

	@Override
	public void onValidate(AirportTicketModel airportTicketModel, InterceptorContext context) throws InterceptorException {
		if(airportTicketModel.getAirportRoute().getFlight().getPlane().getNumOfSits()<
				airportTicketModel.getAirportRoute().getPassenger().size()) {
			
			LOG.info("Sold-out seats");
			throw new InterceptorException("Sold-out seats");
			
		}
		
		else {
			
			LOG.info("Ticket added");
			
		}
		
		
	}

	
}
