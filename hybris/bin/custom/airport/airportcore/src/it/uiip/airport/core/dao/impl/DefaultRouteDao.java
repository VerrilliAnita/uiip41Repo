package it.uiip.airport.core.dao.impl;

import java.util.Date;
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
		final StringBuilder queryStr = new StringBuilder();
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
	public List<RouteModel> findAllRoutes() {
		LOG.info("call method ---> findAllRoutes() in DefaultRouteDao class");
		final StringBuilder queryStr = new StringBuilder();
		queryStr.append("SELECT {r.pk} FROM {Route as r} ");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		final SearchResult<RouteModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}

	@Override
	public List<RouteModel> findRoutesByState(String state) {
		LOG.info("call method ---> findAllRoutes() in DefaultRouteDao class");
		final StringBuilder queryStr = new StringBuilder();
		/*
		 * queryStr.append("SELECT {r.pk} FROM { Route AS r } ");
		 * queryStr.append("WHERE {r.state} =  ({{ ");
		 * queryStr.append("SELECT {s.pk} FROM {stateRoute AS s} ");
		 * queryStr.append("WHERE {s.code} = ?state "); queryStr.append("}}) ");
		 */
		queryStr.append("SELECT {r.pk} FROM {Route AS r ");
		queryStr.append("JOIN stateRoute AS s ON {s.pk} = {r.state} ");
		queryStr.append("} WHERE {s.code} = ?state  ");

		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("state", state);
		final SearchResult<RouteModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}

	@Override
	public List<RouteModel> findRoutesByCityAndDate(String city, Date date) {
		LOG.info("call method ---> findRoutesByCityAndDate(String city, Date date) in DefaultRouteDao class");
		final StringBuilder queryStr = new StringBuilder();
		queryStr.append("SELECT {r.pk} FROM {Route AS r ");
		queryStr.append("JOIN Flight AS f ON {f.pk} = {r.flight} ");
		queryStr.append("JOIN Airport AS a ON {a.pk} = {f.airportDep} } ");
		queryStr.append("WHERE {a.city} = ?city AND {r.dateRouteDep} LIKE ?date%");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("city", city);
		fsq.addQueryParameter("date", date);
		final SearchResult<RouteModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}

	@Override
	public List<RouteModel> findRoutesByAirportDep(String airport) {
		// TODO Auto-generated method stub
		LOG.info("call method ---> findRoutesByAirportDep(String airport) in DefaultRouteDao class");
		final StringBuilder queryStr = new StringBuilder();
		queryStr.append("SELECT {r.pk} FROM {Route AS r ");
		queryStr.append("JOIN Flight AS f ON {f.pk} = {r.flight} ");
		queryStr.append("JOIN Airport AS a ON {f.airportDep} = {a.pk}} ");
		queryStr.append("WHERE {a.city} = ?airport ");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("airport", airport);
		final SearchResult<RouteModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}

	@Override
	public List<RouteModel> findRoutesByCommander(String commander, String month) {
		
		
		LOG.info("call method ---> findRoutesByCommander(String commander) in DefaultRouteDao class");
		final StringBuilder queryStr = new StringBuilder();
		queryStr.append("SELECT {r.pk} FROM {Route AS r ");
		queryStr.append("JOIN Crew AS c ON {r.crew} = {c.pk} ");
		queryStr.append("JOIN Pilot AS p ON {c.commander} = {p.pk}} ");
		queryStr.append("WHERE {p.name} = ?commander AND {R.dateRouteDep} LIKE %-?month%");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("commander", commander);
		final SearchResult<RouteModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}
	
	

}
