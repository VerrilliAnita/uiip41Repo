/**
 *
 */
package it.uiip.airport.core.dao.impl;


import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.Date;
import java.util.List;

import it.uiip.airport.core.dao.AirportRouteDao;
import it.uiip.airport.core.model.RouteModel;


/**
 * @author soprasteria
 *
 */
public class DefaultAirportRouteDao extends DefaultGenericDao<RouteModel> implements AirportRouteDao
{

	/**
	 * @param typecode
	 */
	public DefaultAirportRouteDao(final String typecode)
	{
		super(typecode);
	}


	@Override
	public List<RouteModel> findAllAirportRoute()
	{
		final StringBuilder queryStr = new StringBuilder();
		queryStr.append("SELECT {R.pk} FROM {Route AS R}");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		final SearchResult<RouteModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}


	@Override
	public List<RouteModel> findAirportRouteByCode(final String codeRoute)
	{
		final StringBuilder queryStr = new StringBuilder();
		queryStr.append("SELECT {R.pk} FROM {Route AS R}");
		queryStr.append("WHERE {R.codeRoute}=?codeRoute");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("codeRoute", codeRoute);
		final SearchResult<RouteModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}

	@Override
	public List<RouteModel> findAirportRouteDeleted(final String status)
	{
		final StringBuilder queryStr = new StringBuilder();
		queryStr.append("SELECT {R.pk} FROM {Route AS R join statusRouteEnum as E on {E.pk}={R.statusRoute} }");
		queryStr.append("Where {E.code}= ?status");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("status", status);
		final SearchResult<RouteModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}
	
	@Override
	 public List<RouteModel> findFlightRouteByCityAndDay(String city, Date date) {
	  final StringBuilder queryStr = new StringBuilder();
	  queryStr.append("Select {R.pk} FROM {Route AS R JOIN Flight as F ON {R.flight}={F.pk}");
	  queryStr.append("JOIN Airport AS A ON {F.airportDep}={A.pk} }");
	  queryStr.append("WHERE {A.city}=?city AND {R.dateRouteDep} LIKE ? date%");
	  final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
	  fsq.addQueryParameter("city", city);
	  fsq.addQueryParameter("date", date);
	  final SearchResult<RouteModel> result = getFlexibleSearchService().search(fsq);
	  return result.getResult();
	  
	 }
	

}
