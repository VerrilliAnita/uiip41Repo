/**
 *
 */
package it.uiip.airport.core.dao;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;

import java.util.List;

import it.uiip.airport.core.model.TicketModel;


/**
 * @author soprasteria
 *
 */
public interface TicketDao extends GenericDao<TicketModel>
{
	public List<TicketModel> findTicketsByCodeRoute(String codeRoute);
}
