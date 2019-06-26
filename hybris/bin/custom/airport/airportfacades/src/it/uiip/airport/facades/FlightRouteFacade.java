package it.uiip.airport.facades;

import java.util.List;

import it.uiip.airport.facades.data.FlightRouteData;

public interface FlightRouteFacade {
	
	public List<FlightRouteData> getRoutesForCode(String codeRoute);

}
