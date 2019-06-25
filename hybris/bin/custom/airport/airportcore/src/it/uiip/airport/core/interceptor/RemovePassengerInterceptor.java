package it.uiip.airport.core.interceptor;

import java.util.Date;
import java.util.List;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;
import it.uiip.airport.core.service.FlightTicketService;

public class RemovePassengerInterceptor implements RemoveInterceptor<PassengerModel> {
	
	private FlightTicketService flightTicketService;

	@Override
	public void onRemove(PassengerModel passenger, InterceptorContext context) throws InterceptorException {
		final List<FlightTicketModel> ticketlist = flightTicketService.getTicketsForPassenger(passenger.uid());
		final Date today = new Date();
		for (final FlightTicketModel tf : ticketlist) {
			if (tf.getAirportRoute().getDateRouteDep().after(today)) {
				context.getModelService().remove(tf);
			}
		}
		
	}

	public FlightTicketService getFlightTicketService() {
		return flightTicketService;
	}

	public void setFlightTicketService(FlightTicketService flightTicketService) {
		this.flightTicketService = flightTicketService;
	}


}
