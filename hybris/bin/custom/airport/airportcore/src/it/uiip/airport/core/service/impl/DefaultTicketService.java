package it.uiip.airport.core.service.impl;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.dao.TicketDao;
import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.core.service.TicketService;



public class DefaultTicketService implements TicketService{
	
	private static final Logger LOG = Logger.getLogger(DefaultTicketService.class);
	private TicketDao ticketDao;

	@Override
	public List<TicketModel> getTicketForRoute(String route) {
		LOG.info("Invoke method getTicketForRoute in DefaultTicketService");
		return ticketDao.findTicketByRoute(route);
	}

	@Override
	public List<TicketModel> getAllTickets() {
		LOG.info("Invoke method getAllTickets in DefaultTicketService");
		return ticketDao.findAllTickets();
	}

	public TicketDao getTicketDao() {
		return ticketDao;
	}
	
	@Required
	public void setTicketDao(TicketDao ticketDao) {
		this.ticketDao = ticketDao;
	}
	
	

}
