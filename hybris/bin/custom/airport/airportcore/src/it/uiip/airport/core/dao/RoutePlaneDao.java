package it.uiip.airport.core.dao;

import it.uiip.airport.core.model.RouteModel;

public interface RoutePlaneDao {
	public RouteModel findRouteByCodeRoute(String codeRoute);
}
