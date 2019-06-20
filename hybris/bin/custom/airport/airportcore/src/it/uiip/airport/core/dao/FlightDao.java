package it.uiip.airport.core.dao;

import java.util.List;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;
import it.uiip.airport.core.model.FlightModel;


public interface FlightDao extends GenericDao<FlightModel>  {

	public List<FlightModel> findFlightsByCity(String city);
	public List<FlightModel> findFlightsByDate(String date);
	
}
