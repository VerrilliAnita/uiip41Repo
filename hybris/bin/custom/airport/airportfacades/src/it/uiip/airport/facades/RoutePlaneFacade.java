package it.uiip.airport.facades;

import java.util.List;

import it.uiip.airport.facades.data.RouteData;


public interface RoutePlaneFacade {

	public RouteData getRouteForFlight(String codeFlight);
	
}
