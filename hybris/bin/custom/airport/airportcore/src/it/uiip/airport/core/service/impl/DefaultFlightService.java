package it.uiip.airport.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import it.uiip.airport.core.dao.FlightDao;
import it.uiip.airport.core.model.FlightModel;
import it.uiip.airport.core.service.FlightService;

public class DefaultFlightService implements FlightService{

	@Resource
    private FlightDao flightDao;
	
	@Override
	public List<FlightModel> getFlightsForCity(String city) {
		return flightDao.findFlightsByCity(city);
	}

	@Override
	public List<FlightModel> getFlightsForDate(String date) {
		return flightDao.findFlightsByDate(date);
	}
	
	

}
