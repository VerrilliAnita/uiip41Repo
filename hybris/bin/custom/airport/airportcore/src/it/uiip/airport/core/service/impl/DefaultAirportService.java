package it.uiip.airport.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.dao.AirportDao;
import it.uiip.airport.core.model.AirportModel;
import it.uiip.airport.core.service.AirportService;

public class DefaultAirportService implements AirportService {
	
	
	 private AirportDao airportDao;
	 
	 private static final Logger LOG = Logger.getLogger(DefaultAirportService.class);


	@Override
	public List<AirportModel> getAirportsForCity(String city) {
		LOG.info("Find airports by city");
		return airportDao.findAirportsByCity(city);
	}
	
	public AirportDao getAirportDao() {
		return airportDao;
	}


	@Required
	public void setAirportDao(AirportDao airportDao) {
		this.airportDao = airportDao;
	}

	@Override
	public List<AirportModel> getAllAirports() {
		return airportDao.findAllAirports();
	}

}
