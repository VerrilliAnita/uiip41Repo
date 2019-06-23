package it.uiip.airport.core.service.impl;

import java.util.List;

import org.apache.log4j.Logger;

import it.uiip.airport.core.dao.AirportDao;
import it.uiip.airport.core.dao.TicketDao;
import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.core.service.TicketService;

public class DefaultTicketService implements TicketService {
	
	private static final Logger LOG = Logger.getLogger(DefaultTicketService.class);
	private TicketDao ticketDao;
	
	@Override
	public List<TicketModel> getTicketsForCodeTicket(String code) {
		// TODO Auto-generated method stub
		LOG.info("Invoke method findAirportsByCity in DefaultAirportService");
		return ticketDao.findTicketsByCodeTicket(code);
	}

	public TicketDao getTicketDao() {
		return ticketDao;
	}

	public void setTicketDao(TicketDao ticketDao) {
		this.ticketDao = ticketDao;
	}

	

	
}
