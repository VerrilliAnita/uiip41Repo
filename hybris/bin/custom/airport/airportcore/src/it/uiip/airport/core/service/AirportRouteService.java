/**
 *
 */
package it.uiip.airport.core.service;

import java.util.List;

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

}
