package it.uiip.airport.core.interceptor;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;
import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.core.service.TicketPlaneService;

public class PassengerRemoveInterceptor implements RemoveInterceptor<PassengerModel> {
	 
	private TicketPlaneService ticketPlaneService;
	
	
	@Override
	public void onRemove(PassengerModel passengerModel, InterceptorContext context) throws InterceptorException {
		final List<TicketModel> tickets = ticketPlaneService.getTicketsPlaneForPassenger(passengerModel.getUid());
		final Date today=new Date();
		for(TicketModel ticket : tickets) {
			if(ticket.getRoute().getDataRouteDep().after(today)) 
			{
				context.getModelService().remove(ticket);
			}
		}
		
	}


	public TicketPlaneService getTicketPlaneService() {
		return ticketPlaneService;
	}

	@Required
	public void setTicketPlaneService(TicketPlaneService ticketPlaneService) {
		this.ticketPlaneService = ticketPlaneService;
	}
	
	
	

}
