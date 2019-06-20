package it.uiip.airport.core.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.dao.FlightDao;
import it.uiip.airport.core.model.FlightModel;
import it.uiip.airport.core.service.FlightService;

public class DefaultFlightService implements FlightService {


	 @Resource
	 private FlightDao FlightDao;

	 @Override
	 public List<FlightModel> getFlightsForCity(final String city) {
	  return FlightDao.findFlightsByDepartureCity(city);
	 }

	 @Override
	 public List<FlightModel> getFlightsForDate(final Date date) {
	  return FlightDao.findFlightsByDepartureDate(date);
	 }

	/**
	 * @return the flightDao
	 */
	public FlightDao getFlightDao()
	{
		return FlightDao;
	}

	@Required
	public void setFlightDao(final FlightDao flightDao)
	{
		FlightDao = flightDao;
	}


}
