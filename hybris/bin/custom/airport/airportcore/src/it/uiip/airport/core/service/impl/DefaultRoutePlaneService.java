package it.uiip.airport.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.dao.RoutePlaneDao;

import it.uiip.airport.core.model.RouteModel;
import it.uiip.airport.core.service.RoutePlaneService;

public class DefaultRoutePlaneService implements RoutePlaneService {
	
	private RoutePlaneDao routePlaneDao;

	@Override
	public RouteModel getRouteByCodeRoute(String codeRoute) {
		
		return routePlaneDao.findRouteByCodeRoute(codeRoute);
	}

	public RoutePlaneDao getRoutePlaneDao() {
		return routePlaneDao;
	}
	
	@Required
	public void setRoutePlaneDao(RoutePlaneDao routePlaneDao) {
		this.routePlaneDao = routePlaneDao;
	}

	@Override
	public List<RouteModel> getRouteForStatus(String status) {
		// TODO Auto-generated method stub
		return routePlaneDao.findRouteByStatus(status);
	}

}
