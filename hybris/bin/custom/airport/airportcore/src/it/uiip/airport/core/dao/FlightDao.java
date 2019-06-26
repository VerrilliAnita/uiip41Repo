/**
 *
 */
package it.uiip.airport.core.dao;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;

import java.util.Date;
import java.util.List;

import it.uiip.airport.core.model.FlightModel;
import it.uiip.airport.core.model.RouteModel;


/**
 * @author soprasteria
 *
 */
public interface FlightDao extends GenericDao<FlightModel>{

	public List<FlightModel> findFlightsByDepartureCity(String city);
	public List<FlightModel> findFlightsByDepartureDate(Date date);
	public FlightModel findFlightByCodeFlight(String codeFlight);
	public List<FlightModel> findAllFlight();

}
