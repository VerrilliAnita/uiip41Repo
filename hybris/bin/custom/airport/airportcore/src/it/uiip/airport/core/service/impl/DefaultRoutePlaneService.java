package it.uiip.airport.core.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.dao.RouteDao;
import it.uiip.airport.core.model.RouteModel;
import it.uiip.airport.core.service.RoutePlaneService;

public class DefaultRoutePlaneService implements RoutePlaneService{
	
	private static final Logger LOG = Logger.getLogger(DefaultRoutePlaneService.class);
	private RouteDao routeDao;

	@Override
	public RouteModel getRouteForFlight(String codeFlight) {
		LOG.info("Invoke method getRouteForFlight in DefaultRouteService");
		return routeDao.findRouteByFlight(codeFlight);
	}

	@Override
	public List<RouteModel> getAllRoutes() {
		LOG.info("Invoke method getAllRoute in DefaultRouteService");
		return routeDao.findAllRoutes();
	}
	
	@Override
	public RouteModel getRouteForCodeRoute(String codeRoute) {
		return routeDao.findRouteByCodeRoute(codeRoute);
	}

	public RouteDao getRouteDao() {
		return routeDao;
	}
	
	@Required
	public void setRouteDao(RouteDao routeDao) {
		this.routeDao = routeDao;
	}

	
	

}
