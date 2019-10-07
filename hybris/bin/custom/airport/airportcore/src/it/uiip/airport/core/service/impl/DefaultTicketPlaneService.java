package it.uiip.airport.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.dao.TicketPlaneDao;
import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.core.service.TicketPlaneService;

public class DefaultTicketPlaneService implements TicketPlaneService {
	
	private static final Logger LOG = Logger.getLogger(DefaultTicketPlaneService.class);
	
	@Resource
	TicketPlaneDao ticketPlaneDao;
	
	@Override
	public List<TicketModel> getTicketsForRoute(String codeRoute) {
		LOG.info("call method --> getTicketsForRoute(String codeRoute) in DefaultTicketService class");
		return ticketPlaneDao.findTicketsByRoute(codeRoute);
	}

	@Override
	public List<TicketModel> getTicketsForPassenger(String uid) {
		LOG.info("call method --> getTicketForPassenger(String uid) in DefaultTicketService class");
		return ticketPlaneDao.findTicketsByPassenger(uid);
	}

	public TicketPlaneDao getTicketPlaneDao() {
		return ticketPlaneDao;
	}

	@Required
	public void setTicketPlaneDao(TicketPlaneDao ticketPlaneDao) {
		this.ticketPlaneDao = ticketPlaneDao;
	}
	
	
	
	

}
