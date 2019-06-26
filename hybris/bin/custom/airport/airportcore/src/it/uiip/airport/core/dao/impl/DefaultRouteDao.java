package it.uiip.airport.core.dao.impl;

import java.util.List;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import it.uiip.airport.core.dao.RouteDao;
import it.uiip.airport.core.model.RouteModel;

public class DefaultRouteDao extends DefaultGenericDao<RouteModel> implements RouteDao {

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

	@Override
	public RouteModel findRouteByCodeRoute(String codeRoute) {
		final StringBuilder queryStr = new StringBuilder();
		queryStr.append("SELECT {r.pk} FROM {Route as r} ");
		queryStr.append("WHERE {r.codeRoute} = ?codeRoute");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("codeRoute", codeRoute);
		final SearchResult<RouteModel> result = getFlexibleSearchService().search(fsq);
		if (result.getResult().isEmpty())
			return null;
		return result.getResult().get(0);
	}
	
	
	@Override
	public List<RouteModel> findRouteByFlightStatus(String status) {
		final StringBuilder queryStr = new StringBuilder();
		queryStr.append("SELECT {r.pk} FROM {Route AS r JOIN flightStatusEnum AS f ");
		queryStr.append("ON {r.flightStatus} = {f.pk} } ");
		queryStr.append("WHERE {f.code} = ?status");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("status", status);
		final SearchResult<RouteModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}
}
