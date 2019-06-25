package it.uiip.airport.core.dao;

import java.util.List;

import it.uiip.airport.core.model.RouteModel;

public interface RoutePlaneDao {
	public RouteModel findRouteByCodeRoute(String codeRoute);
	public List<RouteModel> findRouteByStatus(String status);
}
