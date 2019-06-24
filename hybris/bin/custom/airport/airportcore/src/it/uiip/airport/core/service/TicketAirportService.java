package it.uiip.airport.core.service;

import java.util.List;

import it.uiip.airport.core.model.TicketAirportModel;

public interface TicketAirportService {

	public List<TicketAirportModel> getTicketForRoute(String route);
	
	public List<TicketAirportModel> getAllTickets();
	public List<TicketAirportModel> getTicketsForPassenger(String uid);

}
