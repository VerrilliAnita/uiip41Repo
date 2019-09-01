package it.uiip.airport.core.service;

import java.util.List;

import it.uiip.airport.core.model.RouteModel;

public interface RoutePlaneService {

	public RouteModel getRouteForFlight(String codeFlight);
	public RouteModel getRouteForCode(String codeRoute);
	public List<RouteModel> getAllRoutes();
	public List<RouteModel> getRoutesForState(String state);
	
	public List<RouteModel> getRoutesForAirportDep(String airportDep);
	public List<RouteModel> getRoutesForCommander(String commander, String month);
	
}
