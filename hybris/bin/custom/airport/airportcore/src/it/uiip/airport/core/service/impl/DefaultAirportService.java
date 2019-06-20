package it.uiip.airport.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import it.uiip.airport.core.dao.AirportDao;
import it.uiip.airport.core.model.AirportModel;
import it.uiip.airport.core.service.AirportService;

public class DefaultAirportService implements AirportService {
	
	@Resource
	 private AirportDao airportDao;
	  
	@Override
	public List<AirportModel> getAirportsForCity(String city) {
		
		return airportDao.findAirportsByCity(city);
	}

}
