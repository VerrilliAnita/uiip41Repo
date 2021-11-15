package it.uiip.airport.facades.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import it.uiip.airport.core.model.AirportTicketModel;
import it.uiip.airport.core.model.RouteModel;
import it.uiip.airport.core.service.AirportTicketService;
import it.uiip.airport.core.service.FlightRouteService;
import it.uiip.airport.facades.FlightRouteFacade;
import it.uiip.airport.facades.data.AirportTicketData;
import it.uiip.airport.facades.data.RouteData;

public class DefaultFlightRouteFacade implements FlightRouteFacade {
	
	private FlightRouteService flightRouteService;
	private Converter<FlightRouteModel, FlightRouteData> flightRouteConverter;

	@Override
	public List<FlightRouteData> getRoutesForCode(String codeRoute) {
		return flightRouteConverter.convertAll(flightRouteService.getRoutesForCode(codeRoute));
	}
	
	/**
	 * @return the flightRouteService
	 */
	public FlightRouteService getFlightRouteService()
	{
		return flightRouteService;
	}


	@Required
	public void setFlightRouteService(final FlightRouteService flightRouteService)
	{
		this.flightRouteService = flightRouteService;
	}

	/**
	 * @return the flightRouteConverter
	 */
	public Converter<FlightRouteModel, FlightRouteData> getFlightRouteConverter()
	{
		return flightRouteConverter;
	}


	@Required
	public void setFlightRouteConverter(final Converter<FlightRouteModel, FlightRouteData> flightRouteConverter)
	{
		this.flightRouteConverter = flightRouteConverter;
	}


}
