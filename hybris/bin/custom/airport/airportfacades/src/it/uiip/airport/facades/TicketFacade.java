/**
 *
 */
package it.uiip.airport.facades;

import java.util.List;

import it.uiip.airport.facades.data.TicketData;


/**
 * @author soprasteria
 *
 */
public interface TicketFacade
{
	public List<TicketData> getTicketsForCodeTicket(String codeTicket);
}
