package it.uiip.airport.core.service;

import java.util.List;

import it.uiip.airport.core.model.TicketModel;

public interface TicketPlaneService {

	public List<TicketModel> getTicketsForRoute(String codeRoute);
	public List<TicketModel> getTicketsForPassenger(String uid);
	
}
