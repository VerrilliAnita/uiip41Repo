package it.uiip.airport.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.dao.AirportDao;
import it.uiip.airport.core.model.AirportModel;
import it.uiip.airport.core.service.AirportService;

public class DefaultAirportService implements AirportService {
	
	
	 private AirportDao airportDao;
	 
	 
	  
	



	@Override
	public List<AirportModel> getAirportsForCity(String city) {
		
		return airportDao.findAirportsByCity(city);
	}
	
	public AirportDao getAirportDao() {
		return airportDao;
	}


	@Required
	public void setAirportDao(AirportDao airportDao) {
		this.airportDao = airportDao;
	}

}
