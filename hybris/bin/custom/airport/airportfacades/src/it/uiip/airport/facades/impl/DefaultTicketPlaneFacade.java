package it.uiip.airport.facades.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.core.service.TicketPlaneService;
import it.uiip.airport.facades.TicketPlaneFacade;
import it.uiip.airport.facades.data.TicketData;

public class DefaultTicketPlaneFacade implements TicketPlaneFacade{

	private static final Logger LOG = Logger.getLogger(DefaultTicketPlaneFacade.class);

	private TicketPlaneService ticketPlaneService;

	private Converter<TicketModel, TicketData> ticketConverter;
	
	@Override
	public List<TicketData> getTicketsForRoute(String codeRoute) {
		LOG.info("call method --> getTicketsForRoute(String codeRoute) in DefaultTicketFacade");
		return ticketConverter.convertAll(ticketPlaneService.getTicketsForRoute(codeRoute));
	}

	@Override
	public List<TicketData> getTicketsForPassenger(String uid) {
		LOG.info("call method --> getTicketForPassenger(String uid) in DefaultTicketFacade");
		return ticketConverter.convertAll(ticketPlaneService.getTicketsForPassenger(uid));
	}

	public TicketPlaneService getTicketService() {
		return ticketPlaneService;
	}

	@Required
	public void setTicketPlaneService(TicketPlaneService ticketPlaneService) {
		this.ticketPlaneService = ticketPlaneService;
	}

	public Converter<TicketModel, TicketData> getTicketConverter() {
		return ticketConverter;
	}

	@Required
	public void setTicketConverter(Converter<TicketModel, TicketData> ticketConverter) {
		this.ticketConverter = ticketConverter;
	}
	
	

}
