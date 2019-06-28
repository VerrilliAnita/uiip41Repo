/**
 *
 */
package it.uiip.airport.core.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import it.uiip.airport.core.model.RouteModel;


/**
 * @author soprasteria
 *
 */
public interface AirportRouteService
{
	public List<RouteModel> getAllRoutes();

	public List<RouteModel> getRoutesForCode(String codeRoute);

	public List<RouteModel> getRoutesForStatus(String status);

	public Map<String, ArrayList<RouteModel>> getRoutesForCityAndDate(String cityDep, String cityArr, Date date);

}
