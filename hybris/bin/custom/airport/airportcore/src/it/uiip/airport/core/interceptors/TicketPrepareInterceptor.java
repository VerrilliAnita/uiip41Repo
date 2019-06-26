package it.uiip.airport.core.interceptors;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import it.uiip.airport.core.event.airport.TicketEvent;
import it.uiip.airport.core.model.TicketModel;

public class TicketPrepareInterceptor implements PrepareInterceptor {
	
	private static final Logger LOG = Logger.getLogger(TicketPrepareInterceptor.class);
	
	private EventService eventService;
	
	@Override
	public void onPrepare(Object model, InterceptorContext ctx) throws InterceptorException {
		LOG.info("Call interceptor method --> onPrepare(Object model, InterceptorContext ctx) in TicketPrepareInterceptor");
		if(model instanceof TicketModel && model != null) {
			TicketModel ticket = (TicketModel) model;
			if(ctx.isModified(ticket, "state")) {
				LOG.info("prima volta o modificato");
				TicketEvent ticketEvent = new TicketEvent(ticket.getRoute());
				eventService.publishEvent(ticketEvent);
			}
			else {
				LOG.info("non è stato cambiato l'attributo state");
			}
		}
	}

	public EventService getEventService() {
		return eventService;
	}

	@Required
	public void setEventService(EventService eventService) {
		this.eventService = eventService;
	}
	
	

}
