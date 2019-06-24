package it.uiip.airport.core.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import it.uiip.airport.core.dao.RouteDao;
import it.uiip.airport.core.model.RouteModel;

public class DefaultRouteDao extends DefaultGenericDao<RouteModel> implements RouteDao {
	
	private static final Logger LOG = Logger.getLogger(DefaultRouteDao.class);
	
	public DefaultRouteDao(String typecode) {
		super(typecode);
	}

	@Override
	public RouteModel findRouteByFlight(String codeFlight) {
		LOG.info("call method ---> findRouteByFlight(String codeFlight) in DefaultRouteDao class");
		final StringBuilder queryStr= new StringBuilder();
		queryStr.append("SELECT {r.pk} FROM {Route as r ");
		queryStr.append("JOIN Flight AS f ON {f.pk} = {r.flight}}");
		queryStr.append("WHERE {f.codeFlight} = ?codeFlight");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("codeFlight", codeFlight);
		final SearchResult<RouteModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult().get(0);
	}
	
	@Override
	public RouteModel findRouteByCode(String codeRoute) {
		LOG.info("call method ---> findRouteByCode(String codeRoute) in DefaultRouteDao class");
		final StringBuilder queryStr= new StringBuilder();
		queryStr.append("SELECT {r.pk} FROM {Route as r} ");
		queryStr.append("WHERE {r.codeRoute} = ?codeRoute");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("codeRoute", codeRoute);
		final SearchResult<RouteModel> result = getFlexibleSearchService().search(fsq);
		if(result.getResult().isEmpty()) 
			return null;
		return result.getResult().get(0);
	}

}
