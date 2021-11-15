package it.uiip.airport.facades;

import java.util.List;

import it.uiip.airport.facades.data.AirportTicketData;

public interface AirportTicketFacade {
	
	public List<AirportTicketData> getTicketsForCodeFlight(String codeFlight);

}
