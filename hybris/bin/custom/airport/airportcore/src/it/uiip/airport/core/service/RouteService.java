package it.uiip.airport.core.service;

import java.util.List;

import it.uiip.airport.core.model.RouteModel;

public interface RouteService {
	
	public RouteModel getRouteForFlight(String codeFlight);
	public List<RouteModel> getAllRoutes();

}
