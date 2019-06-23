/**
 *
 */
package it.uiip.airport.facades.impl;



import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.core.service.TicketService;
import it.uiip.airport.facades.TicketFacade;
import it.uiip.airport.facades.data.TicketData;


/**
 * @author soprasteria
 *
 */
public class DefaultTicketFacade implements TicketFacade
{
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
