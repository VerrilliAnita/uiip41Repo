package it.uiip.airport.core.dao;

import java.util.List;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;
import it.uiip.airport.core.model.FlightRouteModel;

public interface FlightRouteDao extends GenericDao<FlightRouteModel> {
	
	public List<FlightRouteModel> findRouteByCode(String codeRoute);

}
