package it.uiip.airport.core.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.dao.RouteDao;
import it.uiip.airport.core.model.RouteModel;
import it.uiip.airport.core.service.RoutePlaneService;

public class DefaultRoutePlaneService implements RoutePlaneService {
	
	private static final Logger LOG = Logger.getLogger(DefaultRoutePlaneService.class);
	
	@Resource
	private RouteDao routeDao;
	
	@Override
	public RouteModel getRouteForFlight(String codeFlight) {
		LOG.info("call method --> getRouteForFlight(String codeFlight) in DefaultRoutePlaneService class");
		return routeDao.findRouteByFlight(codeFlight);
	}
	
	@Override
	public RouteModel getRouteForCode(String codeRoute) {
		LOG.info("call method --> getRouteForCode(String codeRoute) in DefaultRoutePlaneService class");
		return routeDao.findRouteByCode(codeRoute);
	}

	public RouteDao getRouteDao() {
		return routeDao;
	}

	@Required
	public void setRouteDao(RouteDao routeDao) {
		this.routeDao = routeDao;
	}

}
