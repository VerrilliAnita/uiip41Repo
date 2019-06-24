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
public interface TicketPlaneDao extends GenericDao<TicketModel>
{
	public List<TicketModel> findTicketsByRoute(String code);
	public List<TicketModel> findsTicketsPlaneByPassenger(String codePassenger);

}
