package it.uiip.airport.facades.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import it.uiip.airport.core.model.AirportTicketModel;
import it.uiip.airport.core.service.AirportTicketService;
import it.uiip.airport.facades.AirportTicketFacade;
import it.uiip.airport.facades.data.AirportTicketData;

public class DefaultAirportTicketFacade implements AirportTicketFacade {
	
	private AirportTicketService airportTicketService;
	private Converter<AirportTicketModel, AirportTicketData> airportTicketConverter;


@Override
public List<AirportTicketData> getTicketsForCodeFlight(final String codeFlight)
{
	return airportTicketConverter.convertAll(airportTicketService.getTicketsForCodeRoute(codeFlight));

}

/**
 * @return the ticketService
 */
public AirportTicketService getAirportTicketService()
{
	return airportTicketService;
}


@Required
public void setAirportTicketService(final AirportTicketService airportTicketService)
{
	this.airportTicketService = airportTicketService;
}

/**
 * @return the ticketConverter
 */
public Converter<AirportTicketModel, AirportTicketData> getAirportTicketConverter()
{
	return airportTicketConverter;
}


@Required
public void setAirportTicketConverter(final Converter<AirportTicketModel, AirportTicketData> airportTicketConverter)
{
	this.airportTicketConverter = airportTicketConverter;
}


}
