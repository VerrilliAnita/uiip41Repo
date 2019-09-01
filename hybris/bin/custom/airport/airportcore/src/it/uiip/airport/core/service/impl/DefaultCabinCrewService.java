package it.uiip.airport.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.dao.CabinCrewDao;
import it.uiip.airport.core.model.CabinCrewModel;
import it.uiip.airport.core.service.CabinCrewService;

public class DefaultCabinCrewService implements CabinCrewService {

	private static final Logger LOG = Logger.getLogger(DefaultCabinCrewService.class);
	 @Resource
	private CabinCrewDao cabinCrewDao;
	
	
	@Override
	public List<CabinCrewModel> getCabinCrewForMaxNumberOfRoutes() {
		LOG.info("Invoke method getCabinCrewForMaxNumberOfRoutes in DefaultCabinCrewService");
		return cabinCrewDao.findCabinCrewByMaxNumberOfRoutes();
	}


	@Override
	public List<CabinCrewModel> getAllCabinCrew() {
		LOG.info("Invoke method getAllCabinCrew in DefaultCabinCrewService");
		return cabinCrewDao.findAllCabinCrew();
	}


	public CabinCrewDao getCabinCrewDao() {
		return cabinCrewDao;
	}

	@Required
	public void setCabinCrewDao(CabinCrewDao cabinCrewDao) {
		this.cabinCrewDao = cabinCrewDao;
	}

	
	
}
