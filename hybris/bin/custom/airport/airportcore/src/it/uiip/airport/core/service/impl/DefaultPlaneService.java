package it.uiip.airport.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.service.PlaneService;

import it.uiip.airport.core.dao.PlaneDao;
import it.uiip.airport.core.model.PlaneModel;
import it.uiip.airport.core.service.PlaneService;


public class DefaultPlaneService implements PlaneService {

	
	private PlaneDao planeDao;
	
	private static final Logger LOG = Logger.getLogger(DefaultFlightService.class);
	
	
	public PlaneDao getPlaneDao() {
		return planeDao;
	}

	@Required
	public void setPlaneDao(PlaneDao planeDao) {
		this.planeDao = planeDao;
	}


	@Override
	public List<PlaneModel> getPlanesForArrivalCity(String city) {
		// TODO Auto-generated method stub
		LOG.info("Find planes by arrival city " + city);
		return planeDao.findPlanesByArrivalCity(city);
	}

	@Override
	public List<PlaneModel> getAllPlanes() {
		// TODO Auto-generated method stub
		LOG.info("Find all planes");
		return planeDao.findAllPlane();
	}

}
