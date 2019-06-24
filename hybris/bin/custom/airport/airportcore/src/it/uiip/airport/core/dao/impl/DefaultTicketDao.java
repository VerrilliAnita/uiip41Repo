package it.uiip.airport.core.dao.impl;

import java.util.List;
import java.util.Map;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.internal.dao.SortParameters;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import it.uiip.airport.core.dao.TicketDao;
import it.uiip.airport.core.model.TicketModel;

public class DefaultTicketDao extends DefaultGenericDao<TicketModel> implements TicketDao {
	
	/**
	 * @param typecode
	 */
	public DefaultTicketDao(final String typecode)
	{
		super(typecode);
	}

	
	@Override
	public List<TicketModel> findTicketsByCodeRoute(String codeRoute) {
		final StringBuilder queryStr = new StringBuilder();
		queryStr.append("SELECT * FROM {Ticket as T JOIN Route AS R");
		queryStr.append("ON {T.route} = {R.PK} }");
		queryStr.append("WHERE {R.coseRoute} = ?codeRoute");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("codeRoute", codeRoute);
		final SearchResult<TicketModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}

}
