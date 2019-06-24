package it.uiip.airport.facades;

import it.uiip.airport.facades.data.RouteData;

public interface RoutePlaneFacade {
		public RouteData getRouteForCodeRoute(String codeRoute);
}
