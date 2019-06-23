package it.uiip.airport.core.dao.impl;

import java.util.List;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import it.uiip.airport.core.dao.TicketDao;
import it.uiip.airport.core.model.TicketModel;

public class DefaultTicketDao extends DefaultGenericDao<TicketModel> implements TicketDao {

	public DefaultTicketDao(String typecode) {
		super(typecode);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<TicketModel> findTicketByRoute(String route) {
		final StringBuilder queryStr = new StringBuilder();
		queryStr.append("SELECT {t.pk} FROM { Ticket AS t ");
		queryStr.append("JOIN Route AS r ON {r.pk} = {t.route} ");
		queryStr.append("}   WHERE {r.codeRoute} = ?codeRoute");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("route", route);
		final SearchResult<TicketModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}

	@Override
	public List<TicketModel> findAllTickets() {
		final StringBuilder queryStr = new StringBuilder();
		queryStr.append("SELECT {t.pk} FROM {Ticket AS t}");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		final SearchResult<TicketModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}

}
