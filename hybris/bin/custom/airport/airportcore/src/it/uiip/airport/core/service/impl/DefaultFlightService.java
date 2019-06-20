package it.uiip.airport.core.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.dao.FlightDao;
import it.uiip.airport.core.model.FlightModel;
import it.uiip.airport.core.service.FlightService;

public class DefaultFlightService implements FlightService{

	private FlightDao flightDao;
	
	private static final Logger LOG = Logger.getLogger(DefaultFlightService.class);

	
	@Override
	public List<FlightModel> getFlightsForCity(String city) {
		LOG.info("Find flights by city");
		return flightDao.findFlightsByCity(city);
	}

	@Override
	public List<FlightModel> getFlightsForDate(String date) {
		return flightDao.findFlightsByDate(date);
	}

	public FlightDao getFlightDao() {
		return flightDao;
	}

	@Required
	public void setFlightDao(FlightDao flightDao) {
		this.flightDao = flightDao;
	}

	@Override
	public List<FlightModel> getAllFlights() {
		
		return flightDao.findAllFlights();
	}
	
	
	
	

}
