package it.uiip.airport.facades.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import it.uiip.airport.facades.TicketFacade;
import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.core.service.TicketService;
import it.uiip.airport.facades.data.TicketData;

public class DefaultTicketFacade implements TicketFacade{
	
	private TicketService ticketService;
	private Converter<TicketModel,TicketData> ticketConverter;

	@Override
	public List<TicketData> getAllTickets() {
		return ticketConverter.convertAll(ticketService.getAllTickets());
	}
	
	@Override
	public List<TicketData> getTicketsForRoute(String codeRoute) {
		
		return ticketConverter.convertAll(ticketService.getTicketForRoute(codeRoute));
	}

	public TicketService getTicketService() {
		return ticketService;
	}
	
	
	
	
	@Required
	public void setTicketService(TicketService ticketService) {
		this.ticketService = ticketService;
	}

	public Converter<TicketModel, TicketData> getTicketConverter() {
		return ticketConverter;
	}
	
	@Required
	public void setTicketConverter(Converter<TicketModel, TicketData> ticketConverter) {
		this.ticketConverter = ticketConverter;
	}

	
	

}
