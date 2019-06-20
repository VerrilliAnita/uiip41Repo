package it.uiip.airport.cor.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.service.PlaneService;
import it.uiip.airport.core.dao.PlaneDao;
import it.uiip.airport.core.model.PlaneModel;

public class DefaultPlaneService implements PlaneService {

	
	private PlaneDao planeDao;
	
	
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
		return planeDao.findPlanesByArrivalCity(city);
	}

}
