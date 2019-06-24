package it.uiip.airport.facades.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import it.uiip.airport.facades.TicketAirportFacade;
import it.uiip.airport.core.model.TicketAirportModel;
import it.uiip.airport.core.service.TicketAirportService;
import it.uiip.airport.facades.data.TicketAirportData;

public class DefaultTicketAirportFacade implements TicketAirportFacade{
	
	private TicketAirportService ticketAirportService;
	private Converter<TicketAirportModel,TicketAirportData> ticketAirportConverter;

	@Override
	public List<TicketAirportData> getAllTickets() {
		return ticketAirportConverter.convertAll(ticketAirportService.getAllTickets());
	}
	
	@Override
	public List<TicketAirportData> getTicketsForRoute(String codeRoute) {
		
		return ticketAirportConverter.convertAll(ticketAirportService.getTicketForRoute(codeRoute));
	}
	
	@Override
	public List<TicketAirportData> getTicketsForPassenger(String uid) {
		// TODO Auto-generated method stub
		return ticketAirportConverter.convertAll(ticketAirportService.getTicketsForPassenger(uid));
	}
	
	

	public TicketAirportService getTicketAirportService() {
		return ticketAirportService;
	}
	@Required
	public void setTicketAirportService(TicketAirportService ticketAirportService) {
		this.ticketAirportService = ticketAirportService;
	}

	public Converter<TicketAirportModel, TicketAirportData> getTicketAirportConverter() {
		return ticketAirportConverter;
	}
	@Required
	public void setTicketAirportConverter(Converter<TicketAirportModel, TicketAirportData> ticketAirportConverter) {
		this.ticketAirportConverter = ticketAirportConverter;
	}

	

	
	

}
