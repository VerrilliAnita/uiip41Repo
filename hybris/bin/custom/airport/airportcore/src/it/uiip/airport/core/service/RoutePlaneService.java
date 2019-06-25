package it.uiip.airport.core.service;

import java.util.List;

import it.uiip.airport.core.model.RouteModel;

public interface RoutePlaneService {
	public RouteModel getRouteByCodeRoute(String codeRoute);
	public List<RouteModel> getRouteForStatus(String status);

}
