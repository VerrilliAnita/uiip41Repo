package it.uiip.airport.facades;

import java.util.List;

import it.uiip.airport.facades.data.TicketAirportData;

public interface TicketAirportFacade {

	public List<TicketAirportData> getAllTickets();

	public List<TicketAirportData> getTicketsForRoute(String codeRoute);
	
	public List<TicketAirportData> getTicketsForPassenger(String uid);

}
