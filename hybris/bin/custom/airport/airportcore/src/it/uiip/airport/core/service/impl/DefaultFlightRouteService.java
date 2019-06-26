package it.uiip.airport.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;

import com.sun.istack.internal.logging.Logger;

import it.uiip.airport.core.dao.FlightRouteDao;
import it.uiip.airport.core.model.FlightRouteModel;
import it.uiip.airport.core.service.FlightRouteService;


public class DefaultFlightRouteService implements FlightRouteService {
	
	private static final Logger LOG = Logger.getLogger(DefaultFlightRouteService.class);
	@Resource
	private FlightRouteDao flightRouteDao;

	@Override
	public List<FlightRouteModel> getRoutesForCode(final String codeRoute)
	{
		LOG.info("Invoke method findRoutesByCode in DefaultAirportRouteService");
		return flightRouteDao.findRouteByCode(codeRoute);
	}


	@Required
	public void setAirportRouteDao(final FlightRouteDao flightRouteDao)
	{
		this.flightRouteDao = flightRouteDao;
	}

}
