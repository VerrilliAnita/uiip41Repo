package it.uiip.airport.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;

import com.sun.istack.internal.logging.Logger;

import de.hybris.platform.ticket.dao.TicketDao;
import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.core.service.TicketService;

public class DefaultTicketService implements TicketService {

	private static final Logger LOG = Logger.getLogger(DefaultTicketService.class);
	@Resource
	private TicketDao ticketDao;

	@Override
	public List<TicketModel> getTicketsForCodeRoute(final String codeRoute)
	{
		LOG.info("Invoke method findTicketsByCodeFlight in DefaultTicketService");
		return ticketDao.findTicketsByCodeRoute(codeRoute);
	}

	public TicketDao getTicketDao()
	{
		return ticketDao;
	}

	@Required
	public void setTicketDao(final TicketDao ticketDao)
	{
		this.ticketDao = ticketDao;
	}

}
