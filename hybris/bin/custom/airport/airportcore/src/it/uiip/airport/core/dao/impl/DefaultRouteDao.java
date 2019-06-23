package it.uiip.airport.core.dao.impl;

import java.util.List;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import it.uiip.airport.core.dao.RouteDao;
import it.uiip.airport.core.model.RouteModel;

public class DefaultRouteDao extends DefaultGenericDao<RouteModel> implements RouteDao{

	public DefaultRouteDao(String typecode) {
		super(typecode);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RouteModel findRouteByFlight(String codeFlight) {
		final StringBuilder queryStr = new StringBuilder();
		queryStr.append("SELECT {r.pk} FROM {Route AS r");
		queryStr.append("JOIN Flight AS f ON {r.flight} = {f.pk}");
		queryStr.append("} WHERE {f.codeFlight} LIKE ?'codeFlight'");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("codeFlight", codeFlight);
		final SearchResult<RouteModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult().get(0);
		
	}

	@Override
	public List<RouteModel> findAllRoutes() {
		final StringBuilder queryStr = new StringBuilder();
		queryStr.append("SELECT {r.pk} FROM {Route AS r}");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		final SearchResult<RouteModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}

}
