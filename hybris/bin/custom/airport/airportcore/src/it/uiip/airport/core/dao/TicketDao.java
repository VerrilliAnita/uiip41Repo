/**
 *
 */
package it.uiip.airport.core.dao;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;
import it.uiip.airport.core.model.TicketModel;

import java.util.List;




/**
 * @author soprasteria
 *
 */
public interface TicketDao extends GenericDao<TicketModel>
{
	public List<TicketModel> findTicketsByCodeTicket(String codeTicket);
}
