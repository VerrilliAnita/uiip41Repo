package it.uiip.airport.facades;

import java.util.List;

public interface TicketFacade {
	
	public List<TicketData> getTicketsForCodeFlight(String codeFlight);

}
