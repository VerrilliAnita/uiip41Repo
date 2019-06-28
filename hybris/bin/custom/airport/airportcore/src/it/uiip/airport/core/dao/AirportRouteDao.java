/**
 *
 */
package it.uiip.airport.core.dao;

import java.util.Date;
import java.util.List;

import it.uiip.airport.core.model.RouteModel;


/**
 * @author soprasteria
 *
 */
public interface AirportRouteDao
{
	public List<RouteModel> findAllAirportRoute();

	public List<RouteModel> findAirportRouteByCode(String codeRoute);

	public List<RouteModel> findAirportRouteDeleted(String status);

	public List<RouteModel> findAirportRouteByCityAndDay(String city,Date date);

	public List<RouteModel> findAirportRouteByCityDep(String city, String date);
}
