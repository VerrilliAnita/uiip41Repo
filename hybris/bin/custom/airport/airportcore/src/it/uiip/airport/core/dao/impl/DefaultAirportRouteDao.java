/**
 *
 */
package it.uiip.airport.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

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

}
