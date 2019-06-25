/**
 *
 */
package it.uiip.airport.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

import javax.validation.ValidationException;

import org.apache.log4j.Logger;

import it.uiip.airport.core.model.AirportTicketModel;


/**
 * @author soprasteria
 *
 */
public class AddTicketInterceptor implements ValidateInterceptor<AirportTicketModel>
{
	private static final Logger LOG = Logger.getLogger(AddTicketInterceptor.class);
	@Override
	public void onValidate(final AirportTicketModel ticket, final InterceptorContext context) throws InterceptorException
	{
		LOG.info("Call onValidate----------");
		try
		{
			final int sitsTotal = ticket.getRoute().getFlight().getPlane().getNumOfSits();
			final int sitsRoute = ticket.getRoute().getAirportTickets().size();
			if (sitsTotal > sitsRoute)
			{
				LOG.info("Ticket added");
			}
			else
			{
				LOG.error("Ticket not added");
				throw new ValidationException("seats sold-out");
			}
		}
		catch (final NullPointerException e)
		{
			//object null
		}

	}

}
