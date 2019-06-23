package it.uiip.airport.facades;

import java.util.List;

import it.uiip.airport.facades.data.RouteData;
public interface RouteFacade {
	
	public List<RouteData> getAllRoutes();
	public RouteData getRouteForFlight(String codeFlight);

}
