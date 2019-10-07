package it.uiip.airport.core.event.airport;


import de.hybris.platform.servicelayer.event.events.AbstractEvent;
import it.uiip.airport.core.model.RouteModel;

public class TicketEvent extends AbstractEvent {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private RouteModel route;

	public TicketEvent(RouteModel route) {
		super();
		this.route = route;
	}

	public RouteModel getRoute() {
		return route;
	}

	public void setRoute(RouteModel route) {
		this.route = route;
	}

	
	

}
