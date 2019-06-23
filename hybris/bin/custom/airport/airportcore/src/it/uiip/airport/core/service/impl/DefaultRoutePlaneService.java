package it.uiip.airport.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.dao.RouteDao;
import it.uiip.airport.core.model.RouteModel;
import it.uiip.airport.core.service.RoutePlaneService;

public class DefaultRoutePlaneService implements RoutePlaneService {

	@Resource
	private RouteDao routeDao;
	
	@Override
	public RouteModel getRouteForFlight(String codeFlight) {
		return routeDao.findRouteByFlight(codeFlight);
	}

	public RouteDao getRouteDao() {
		return routeDao;
	}

	@Required
	public void setRouteDao(RouteDao routeDao) {
		this.routeDao = routeDao;
	}

}
