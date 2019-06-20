/**
 *
 */
package it.uiip.airport.core.service.impl;

import java.util.List;

import it.uiip.airport.core.dao.AirportDao;
import it.uiip.airport.core.model.AirportModel;
import it.uiip.airport.core.service.AirportService;


/**
 * @author soprasteria
 *
 */
public class DefaultAirportService implements AirportService
{
	private AirportDao airportDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see it.uiip.airport.core.service.AirportService#getAirportsForCity(java.lang.String)
	 */
	@Override
	public List<AirportModel> getAirportsForCity(final String city)
	{
		// XXX Auto-generated method stub
		return airportDao.findAirportsByCity(city);
	}

}
