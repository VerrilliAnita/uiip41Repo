package it.uiip.airport.core.service.impl;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.dao.TicketAirportDao;
import it.uiip.airport.core.model.TicketAirportModel;
import it.uiip.airport.core.service.TicketAirportService;



public class DefaultTicketAirportService implements TicketAirportService{
	
	private static final Logger LOG = Logger.getLogger(DefaultTicketAirportService.class);
	private TicketAirportDao ticketAirportDao;

	@Override
	public List<TicketAirportModel> getTicketForRoute(String route) {
		LOG.info("Invoke method getTicketForRoute in DefaultTicketService");
		return ticketAirportDao.findTicketByRoute(route);
	}

	@Override
	public List<TicketAirportModel> getAllTickets() {
		LOG.info("Invoke method getAllTickets in DefaultTicketService");
		return ticketAirportDao.findAllTickets();
	}

	public TicketAirportDao getTicketAirportDao() {
		return ticketAirportDao;
	}
	
	@Required
	public void setTicketAirportDao(TicketAirportDao ticketAirportDao) {
		this.ticketAirportDao = ticketAirportDao;
	}

	@Override
	public List<TicketAirportModel> getTicketsForPassenger(String uid) {
		return ticketAirportDao.findTicketsByPassenger(uid);
	}
	
	

}
