package it.uiip.airport.core.dao;

import java.util.List;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;

import it.uiip.airport.core.model.TicketAirportModel;

public interface TicketAirportDao extends GenericDao<TicketAirportModel>{
	
	public List<TicketAirportModel> findTicketByRoute(String route);

	public List<TicketAirportModel> findAllTickets();
	public List<TicketAirportModel> findTicketsByPassenger(String uid);

}
