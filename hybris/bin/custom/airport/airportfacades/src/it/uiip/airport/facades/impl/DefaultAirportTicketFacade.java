package it.uiip.airport.facades.impl;

import java.util.List;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;

import com.fasterxml.jackson.databind.util.Converter;

import de.hybris.platform.ticket.service.TicketService;
import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.facades.TicketData;
import it.uiip.airport.facades.TicketFacade;

public class DefaultTicketFacade implements TicketFacade {
	
	private TicketService ticketService;
	private Converter<TicketModel, TicketData> ticketConverter;


@Override
public List<TicketData> getTicketsForCodeFlight(final String codeFlight)
{
	return ticketConverter.convertAll(ticketService.getTicketsForCodeRoute(codeFlight));

}

/**
 * @return the ticketService
 */
public TicketService getTicketService()
{
	return ticketService;
}


@Required
public void setTicketService(final TicketService ticketService)
{
	this.ticketService = ticketService;
}

/**
 * @return the ticketConverter
 */
public Converter<TicketModel, TicketData> getTicketConverter()
{
	return ticketConverter;
}


@Required
public void setTicketConverter(final Converter<TicketModel, TicketData> ticketConverter)
{
	this.ticketConverter = ticketConverter;
}


}
