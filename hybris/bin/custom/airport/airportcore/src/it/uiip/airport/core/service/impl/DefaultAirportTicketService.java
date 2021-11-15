package it.uiip.airport.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;

import com.sun.istack.internal.logging.Logger;

import it.uiip.airport.core.dao.AirportTicketDao;
import it.uiip.airport.core.model.AirportTicketModel;
import it.uiip.airport.core.service.AirportTicketService;


public class DefaultAirportTicketService implements AirportTicketService {

	private static final Logger LOG = Logger.getLogger(DefaultAirportTicketService.class);
	@Resource
	private AirportTicketDao airportTicketDao;

	@Override
	public List<AirportTicketModel> getTicketsForCodeRoute(final String codeRoute)
	{
		LOG.info("Invoke method findTicketsByCodeFlight in DefaultAirportTicketService");
		return airportTicketDao.findTicketsByCodeRoute(codeRoute);
	}

	public AirportTicketDao getAirportTicketDao()
	{
		return airportTicketDao;
	}

	@Required
	public void setAirportTicketDao(final AirportTicketDao airportTicketDao)
	{
		this.airportTicketDao = airportTicketDao;
	}

}
