package it.uiip.airport.core.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import it.uiip.airport.core.dao.TicketPlaneDao;
import it.uiip.airport.core.model.TicketModel;

public class DefaultTicketPlaneDao extends DefaultGenericDao<TicketModel> implements TicketPlaneDao{

	private static final Logger LOG = Logger.getLogger(DefaultTicketPlaneDao.class);
	
	
	public DefaultTicketPlaneDao(String typecode) {
		super(typecode);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public List<TicketModel> findTicketsByRoute(String codeRoute) {
		LOG.info("call method ---> findTicketsByRoute(String codeRoute) in DefaultTicketPlaneDao class");
		final StringBuilder queryStr= new StringBuilder();
		queryStr.append("SELECT {t.pk} FROM { Ticket AS t ");
		queryStr.append("JOIN Route AS r ON {r.pk} = {t.route} ");
		queryStr.append("}   WHERE {r.codeRoute} = ?codeRoute");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("codeRoute", codeRoute);
		final SearchResult<TicketModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}

	@Override
	public List<TicketModel> findTicketsByPassenger(String uid) {
		LOG.info("call method ---> findTicketByPassenger(String uid) in DefaultTicketPlaneDao class");
		final StringBuilder queryStr= new StringBuilder();
		queryStr.append("SELECT {t.pk} FROM { Ticket AS t ");
		queryStr.append("JOIN Passenger AS p ON {p.pk} = {t.passenger} ");
		queryStr.append("}	WHERE {p.uid} = ?uid");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("uid", uid);
		final SearchResult<TicketModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}

}
