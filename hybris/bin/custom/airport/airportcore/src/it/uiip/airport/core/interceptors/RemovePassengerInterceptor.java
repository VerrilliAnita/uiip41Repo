package it.uiip.airport.core.interceptors;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;
import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.model.TicketAirportModel;
import it.uiip.airport.core.service.TicketAirportService;

public class RemovePassengerInterceptor implements RemoveInterceptor {
	
	@Resource
	private TicketAirportService ticketAirportService;

	
	@Override
	public void onRemove(Object model, InterceptorContext ctx) throws InterceptorException {
		if(model instanceof PassengerModel && model != null) {
			PassengerModel passenger = (PassengerModel) model;
			List<TicketAirportModel> tickets = ticketAirportService.getTicketsForPassenger(passenger.getUid());
			for(TicketAirportModel ticket : tickets) {
				if(ticket.getRoute().getDateRouteDep().after(new Date()))
					ctx.getModelService().remove(ticket);
			}
		}
	}
	
	public TicketAirportService getTicketAirportService() {
		return ticketAirportService;
	}
	
	@Required
	public void setTicketAirportService(TicketAirportService ticketAirportService) {
		this.ticketAirportService = ticketAirportService;
	}

}
