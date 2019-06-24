/**
 *
 */
package it.uiip.airport.facades.impl;



import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.core.service.TicketPlaneService;
import it.uiip.airport.facades.TicketPlaneFacade;
import it.uiip.airport.facades.data.TicketData;


/**
 * @author soprasteria
 *
 */
public class DefaultTicketPlaneFacade implements TicketPlaneFacade
{
	private static final Logger LOG = Logger.getLogger(DefaultTicketPlaneFacade.class);
	
	@Resource
	private TicketPlaneService ticketPlaneService;
	
	@Resource
	private Converter<TicketModel, TicketData> ticketPlaneConverter;



	/**
	 * @return the ticketService
	 */
	public TicketPlaneService getTicketPlaneService()
	{
		return ticketPlaneService;
	}


	@Required
	public void setTicketPlaneService(final TicketPlaneService ticketPlaneService)
	{
		this.ticketPlaneService = ticketPlaneService;
	}


	/**
	 * @return the ticketConverter
	 */
	public Converter<TicketModel, TicketData> getTicketPlaneConverter()
	{
		return ticketPlaneConverter;
	}


	@Required
	public void setTicketPlaneConverter(final Converter<TicketModel, TicketData> ticketPlaneConverter)
	{
		this.ticketPlaneConverter = ticketPlaneConverter;
	}


	@Override
	public List<TicketData> getTicketsForRoute(String code) {
		LOG.info("Call getTicketsForRoute in DefTicketPlaneFacade");
		return ticketPlaneConverter.convertAll(ticketPlaneService.getTicketsForRoute(code));
	}


	

}
