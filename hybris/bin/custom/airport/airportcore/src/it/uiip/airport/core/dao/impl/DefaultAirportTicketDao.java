package it.uiip.airport.core.dao.impl;

import java.util.List;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.internal.dao.SortParameters;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import it.uiip.airport.core.dao.AirportTicketDao;
import it.uiip.airport.core.model.AirportTicketModel;
import it.uiip.airport.core.model.AirportTicketModel;

public class DefaultAirportTicketDao extends DefaultGenericDao<AirportTicketModel> implements AirportTicketDao {
	
	/**
	 * @param typecode
	 */
	public DefaultAirportTicketDao(final String typecode)
	{
		super(typecode);
	}

	
	@Override
	public List<AirportTicketModel> findTicketsByCodeRoute(String codeRoute) {
		final StringBuilder queryStr = new StringBuilder();
		queryStr.append("SELECT {T.PK} FROM {Ticket as T JOIN Route AS R");
		queryStr.append("ON {T.route} = {R.PK} }");
		queryStr.append("WHERE {R.coseRoute} = ?codeRoute");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("codeRoute", codeRoute);
		final SearchResult<AirportTicketModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}

}
