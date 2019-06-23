package it.uiip.airport.core.dao;

import java.util.List;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;
import it.uiip.airport.core.model.TicketModel;

public interface TicketPlaneDao extends GenericDao<TicketModel>{
	
	public List<TicketModel> findTicketsByRoute(String codeRoute);
	public List<TicketModel> findTicketsByPassenger(String uid);

}
