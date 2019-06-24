/**
 *
 */
package it.uiip.airport.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import it.uiip.airport.core.dao.TicketPlaneDao;
import it.uiip.airport.core.model.TicketModel;




/**
 * @author soprasteria
 *
 */
public class DefaultTicketPlaneDao extends DefaultGenericDao<TicketModel> implements TicketPlaneDao
{
	/**
	 * @param typecode
	 */
	public DefaultTicketPlaneDao(final String typecode)
	{
		super(typecode);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see it.uiip.airport.core.dao.TicketDao#findTicketsByCodeFlight(java.lang.String)
	 */
	@Override
	public List<TicketModel> findTicketsByRoute(final String code)
	{
		final StringBuilder queryStr = new StringBuilder();
		queryStr.append("SELECT * FROM {Ticket as T JOIN Route AS R ");
		queryStr.append("ON {T.route} = {T.PK} }");
		queryStr.append("WHERE {R.codeRoute} = ?codeRoute");
		
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		
		fsq.addQueryParameter("codeRoute", code);
		final SearchResult<TicketModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}

	@Override
	public List<TicketModel> findsTicketsPlaneByPassenger(String codePassenger) {
		final StringBuilder queryStr = new StringBuilder();		
		queryStr.append("SELECT {T.PK} ");
		queryStr.append("FROM {Passenger as P JOIN Ticket as T ON {P.pk}= {T.passenger} }");
		queryStr.append("WHERE {P.pk} = ?codePassenger");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		
		fsq.addQueryParameter("codePassenger", codePassenger);
		final SearchResult<TicketModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}
	
	

}
