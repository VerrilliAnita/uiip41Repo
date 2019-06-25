package it.uiip.airport.core.interceptor;

import org.apache.log4j.Logger;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import it.uiip.airport.core.model.TicketModel;

public class TicketPlaneAddInterceptor implements ValidateInterceptor<TicketModel> {
	
	
	private static final Logger LOG = Logger.getLogger(TicketPlaneAddInterceptor.class);

	@Override
	public void onValidate(TicketModel ticketModel, InterceptorContext context) throws InterceptorException {
		if(ticketModel.getRoute().getFlight().getPlane().getNumOfSits() <=
		   ticketModel.getRoute().getTicket().size())
			{
			
			LOG.info("TicketPlane not added for sold-out");
			throw new InterceptorException("sit sold-out");
			}
		else
			{
			LOG.info("TicketPlane added ");
			}
	}

}
