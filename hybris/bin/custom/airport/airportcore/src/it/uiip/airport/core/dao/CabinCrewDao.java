package it.uiip.airport.core.dao;

import java.util.List;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;
import it.uiip.airport.core.model.CabinCrewModel;
import it.uiip.airport.core.model.CrewModel;

public interface CabinCrewDao extends GenericDao<CabinCrewModel> {

	public List<CabinCrewModel> findCabinCrewByMaxNumberOfRoutes();
	
	public List<CabinCrewModel> findAllCabinCrew();
	
	
}
