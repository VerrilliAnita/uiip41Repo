package it.uiip.airport.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import it.uiip.airport.core.dao.PlaneDao;
import it.uiip.airport.core.model.PlaneModel;
import it.uiip.airport.core.service.PlaneService;


public class DefaultPlaneService implements PlaneService {

	@Resource
	private PlaneDao planeDao;
	
	@Override
	public List<PlaneModel> getPlanesForArrivalCity(String city) {
		// TODO Auto-generated method stub
		return planeDao.findPlanesByArrivalCity(city);
	}

}
