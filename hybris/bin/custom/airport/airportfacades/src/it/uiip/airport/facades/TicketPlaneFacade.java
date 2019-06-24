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
public interface TicketPlaneFacade
{
	public List<TicketData> getTicketsForRoute(String code);
}
