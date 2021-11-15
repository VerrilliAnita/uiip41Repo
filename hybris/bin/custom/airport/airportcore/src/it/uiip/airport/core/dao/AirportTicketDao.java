package it.uiip.airport.core.dao;

import java.util.List;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;
import it.uiip.airport.core.model.AirportTicketModel;

public interface AirportTicketDao extends GenericDao<AirportTicketModel> {
	
	public List<AirportTicketModel> findTicketsByCodeRoute(String codeRoute);

}
