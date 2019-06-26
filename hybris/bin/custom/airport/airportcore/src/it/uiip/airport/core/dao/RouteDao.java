package it.uiip.airport.core.dao;

import java.util.List;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;
import it.uiip.airport.core.model.RouteModel;

public interface RouteDao extends GenericDao<RouteModel>{
	
	public RouteModel findRouteByFlight(String codeFlight);
	public RouteModel findRouteByCode(String codeRoute);
	public List<RouteModel> findAllRoutes();
	public List<RouteModel> findRoutesByState(String state);
	public List<RouteModel> findRouteByCityAndDate(String city , String date);

}
