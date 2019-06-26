package it.uiip.airport.core.service;

import java.util.List;

import it.uiip.airport.core.model.AirportTicketModel;

public interface AirportTicketService {
	
	public List<AirportTicketModel> getTicketsForCodeRoute(String codeRoute);

}
