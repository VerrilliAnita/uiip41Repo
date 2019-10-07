package it.uiip.airport.facades;

import java.util.List;

import it.uiip.airport.facades.data.TicketData;


public interface TicketPlaneFacade {

	public List<TicketData> getTicketsForRoute(String codeRoute);
	public List<TicketData> getTicketsForPassenger(String uid);
	
}
