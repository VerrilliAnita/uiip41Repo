package it.uiip.airport.facades;

import java.util.List;

import it.uiip.airport.facades.data.RouteData;


public interface RoutePlaneFacade {

	public RouteData getRouteForFlight(String codeFlight);
	public RouteData getRouteForCode(String codeRoute);
	
	public List<RouteData> getRoutesForAirportDep(String airportDep);
	public List<RouteData> getRoutesForCommander(String commander, String month);
}
