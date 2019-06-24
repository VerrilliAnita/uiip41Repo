package it.uiip.airport.core.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;


import it.uiip.airport.core.dao.TicketPlaneDao;
import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.core.service.TicketPlaneService;

public class DefaultTicketPlaneService implements TicketPlaneService {
	
	private static final Logger LOG = Logger.getLogger(DefaultTicketPlaneService.class);
	private TicketPlaneDao ticketPlaneDao;
	
	@Override
	public List<TicketModel> getTicketsForRoute(String code) {
		// TODO Auto-generated method stub
		LOG.info("Invoke method findAirportsByCity in DefaultAirportService");
		return ticketPlaneDao.findTicketsByRoute(code);
	}

	public TicketPlaneDao getTicketPlaneDao() {
		return ticketPlaneDao;
	}
	
	@Required
	public void setTicketPlaneDao(TicketPlaneDao ticketPlaneDao) {
		this.ticketPlaneDao = ticketPlaneDao;
	}

	@Override
	public List<TicketModel> getTicketsPlaneForPassenger(String codePassenger) {
		LOG.info("Invoke method getTicketsPlaneForPassenger in DefaultAirportService");
		return ticketPlaneDao.findsTicketsPlaneByPassenger(codePassenger);
	}

	

	
}
