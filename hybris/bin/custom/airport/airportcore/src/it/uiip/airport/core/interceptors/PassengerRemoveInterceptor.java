package it.uiip.airport.core.interceptors;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;
import it.uiip.airport.core.dao.impl.DefaultRouteDao;
import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.core.service.TicketPlaneService;

public class PassengerRemoveInterceptor implements RemoveInterceptor {
	
	private static final Logger LOG = Logger.getLogger(PassengerRemoveInterceptor.class);
	
	@Resource
	private TicketPlaneService ticketPlaneService; 
	
	@Override
	public void onRemove(Object model, InterceptorContext ctx) throws InterceptorException {
		LOG.info("Call interceptor method --> onRemove() in PassengerRemoveInterceptor");
		if(model instanceof PassengerModel && model != null) {
			PassengerModel passenger = (PassengerModel) model;
			List<TicketModel> tickets = ticketPlaneService.getTicketsForPassenger(passenger.getUid());
			for(TicketModel ticket : tickets) {
				if(ticket.getRoute().getDateRouteDep().after(new Date()))
					ctx.getModelService().remove(ticket);
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
