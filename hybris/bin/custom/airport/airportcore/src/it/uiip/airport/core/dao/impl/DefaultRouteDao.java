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

	@Override
	public List<RouteModel> findAllRoutes() {
		LOG.info("call method ---> findAllRoutes() in DefaultRouteDao class");
		final StringBuilder queryStr= new StringBuilder();
		queryStr.append("SELECT {r.pk} FROM {Route as r} ");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		final SearchResult<RouteModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}

	@Override
	public List<RouteModel> findRoutesByState(String state) {
		LOG.info("call method ---> findAllRoutes() in DefaultRouteDao class");
		final StringBuilder queryStr= new StringBuilder();
		
		queryStr.append("SELECT {r.pk} FROM {Route AS r ");
		queryStr.append("JOIN stateRoute AS s ON {s.pk} = {r.state} ");
		queryStr.append("} WHERE {s.code} = ?state  ");
		
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("state", state);
		final SearchResult<RouteModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}

	@Override
	public List<RouteModel> findRouteByCityAndDate(String city, String date) {
		LOG.info("call method ---> findAllRoutes() in DefaultRouteDao class");
		final StringBuilder queryStr= new StringBuilder();
		queryStr.append("SELECT {R.PK}");
		queryStr.append("FROM {Route as R JOIN Flight as F ON {R.flight}={F.PK} JOIN Airport as A ON {F.airportDep}={A.PK}}");
		queryStr.append("WHERE {R.dateRouteDep} like '?date%' AND {A.city}= ?city");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("date", date);
		fsq.addQueryParameter("city", city);
		
		final SearchResult<RouteModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
		
	}

}
