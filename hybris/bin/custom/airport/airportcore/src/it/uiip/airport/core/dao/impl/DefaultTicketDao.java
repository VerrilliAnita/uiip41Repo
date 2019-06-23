/**
 *
 */
package it.uiip.airport.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import it.uiip.airport.core.dao.TicketDao;
import it.uiip.airport.core.model.TicketModel;




/**
 * @author soprasteria
 *
 */
public class DefaultTicketDao extends DefaultGenericDao<TicketModel> implements TicketDao
{
	/**
	 * @param typecode
	 */
	public DefaultTicketDao(final String typecode)
	{
		super(typecode);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see it.uiip.airport.core.dao.TicketDao#findTicketsByCodeFlight(java.lang.String)
	 */
	@Override
	public List<TicketModel> findTicketsByCodeTicket(final String codeTicket)
	{
		final StringBuilder queryStr = new StringBuilder();
		queryStr.append("SELECT * ");
		queryStr.append("FROM {Ticket as T}");
		queryStr.append("WHERE {R.codeTicket} = ?codeTicket");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("codeTicket", codeTicket);
		final SearchResult<TicketModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}

}
