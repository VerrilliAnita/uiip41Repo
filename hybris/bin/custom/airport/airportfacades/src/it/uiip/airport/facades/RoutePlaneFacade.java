package it.uiip.airport.facades;

import java.util.List;

import it.uiip.airport.facades.data.RouteData;
public interface RoutePlaneFacade {
	
	public List<RouteData> getAllRoutes();
	public RouteData getRouteForCodeRoute(String codeRoute);
	public RouteData getRouteForFlight(String codeFlight);

}
