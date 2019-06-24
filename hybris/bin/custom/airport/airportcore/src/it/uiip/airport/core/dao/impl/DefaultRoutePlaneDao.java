package it.uiip.airport.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import it.uiip.airport.core.dao.RoutePlaneDao;
import it.uiip.airport.core.model.FlightModel;
import it.uiip.airport.core.model.RouteModel;

public class DefaultRoutePlaneDao extends DefaultGenericDao<FlightModel> implements RoutePlaneDao {
	
	public DefaultRoutePlaneDao(final String typecode) {
		super(typecode);
	}

	@Override
	public RouteModel findRouteByCodeRoute(String codeRoute) {
		final StringBuilder queryString = new StringBuilder();
		queryString.append("SELECT {R.pk}");
		queryString.append("FROM {Route AS R}");
		queryString.append("WHERE {R.codeRoute} = ?codeRoute");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryString);
		fsq.addQueryParameter("codeRoute", codeRoute);
		final SearchResult<RouteModel> result = getFlexibleSearchService().search(fsq);
		if(result.getResult().isEmpty()) {
			return null;
		}
		return result.getResult().get(0);
	}

}
