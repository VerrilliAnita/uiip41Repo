package it.uiip.airport.facades;

import java.util.List;

import it.uiip.airport.facades.data.TicketData;

public interface TicketFacade {
	
	public List<TicketData> getAllTickets();
	public List<TicketData> getTicketsForRoute(String codeRoute);

}
