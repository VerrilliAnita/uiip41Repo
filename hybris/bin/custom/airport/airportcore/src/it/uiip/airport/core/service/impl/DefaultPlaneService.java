package it.uiip.airport.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.dao.PlaneDao;
import it.uiip.airport.core.model.PlaneModel;
import it.uiip.airport.core.service.PlaneService;

public class DefaultPlaneService implements PlaneService {

	@Resource
	private PlaneDao planeDao;

	@Override
	public List<PlaneModel> getPlanesForCity(final String city) {
		// TODO Auto-generated method stub
		return planeDao.findPlanesByCity(city);
	}

	/**
	 * @return the planeDao
	 */
	public PlaneDao getPlaneDao()
	{
		return planeDao;
	}

	@Required
	public void setPlaneDao(final PlaneDao planeDao)
	{
		this.planeDao = planeDao;
	}

}
