package it.uiip.airport.core.dao.impl;

import java.util.List;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import it.uiip.airport.core.dao.TicketAirportDao;

import it.uiip.airport.core.model.TicketAirportModel;

public class DefaultTicketAirportDao extends DefaultGenericDao<TicketAirportModel> implements TicketAirportDao {

	public DefaultTicketAirportDao(String typecode) {
		super(typecode);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<TicketAirportModel> findTicketByRoute(String route) {
		final StringBuilder queryStr = new StringBuilder();
		queryStr.append("SELECT {t.pk} FROM { TicketAirport AS t ");
		queryStr.append("JOIN Route AS r ON {r.pk} = {t.route} ");
		queryStr.append("}   WHERE {r.codeRoute} = ?codeRoute");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("codeRoute", route);
		final SearchResult<TicketAirportModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}

	@Override
	public List<TicketAirportModel> findAllTickets() {
		final StringBuilder queryStr = new StringBuilder();
		queryStr.append("SELECT {t.pk} FROM {TicketAirport AS t}");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		final SearchResult<TicketAirportModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}

	@Override
	public List<TicketAirportModel> findTicketsByPassenger(String uid) {
		final StringBuilder queryStr= new StringBuilder();
		queryStr.append("SELECT {t.pk} FROM { TicketAirport AS t ");
		queryStr.append("JOIN Passenger AS p ON {p.pk} = {t.passenger} ");
		queryStr.append("}	WHERE {p.uid} = ?uid");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("uid", uid);
		final SearchResult<TicketAirportModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}
}


