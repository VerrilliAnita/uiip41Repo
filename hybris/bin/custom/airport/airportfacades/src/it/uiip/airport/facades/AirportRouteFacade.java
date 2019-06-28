/**
 *
 */
package it.uiip.airport.facades;

import java.util.Date;
import java.util.List;
import java.util.Map;

import it.uiip.airport.facades.data.AirportRouteData;


/**
 * @author soprasteria
 *
 */
public interface AirportRouteFacade
{
	public List<AirportRouteData> getAllRoutes();

	public List<AirportRouteData> getRoutesForCode(String codeRoute);

	public Map<String, List<AirportRouteData>> getRouteAirportAToAirportB(String cityDep, String cityArr, Date date);

}
