package it.uiip.airport.core.service;


import java.util.List;

import it.uiip.airport.core.model.TicketModel;

public interface TicketService {
	
	public List<TicketModel> getTicketForRoute(String route);
	public List<TicketModel> getAllTickets();

}
