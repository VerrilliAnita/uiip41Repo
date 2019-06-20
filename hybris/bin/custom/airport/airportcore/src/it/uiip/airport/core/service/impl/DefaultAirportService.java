/**
 *
 */
package it.uiip.airport.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

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


	@Override
	public List<AirportModel> getAirportsForCity(final String city)
	{
		// XXX Auto-generated method stub
		return airportDao.findAirportsByCity(city);
	}


	/**
	 * @return the airportDao
	 */
	public AirportDao getAirportDao()
	{
		return airportDao;
	}


	@Required
	public void setAirportDao(final AirportDao airportDao)
	{
		this.airportDao = airportDao;
	}


}
