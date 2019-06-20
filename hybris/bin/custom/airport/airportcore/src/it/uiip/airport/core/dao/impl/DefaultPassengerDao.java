/**
 *
 */
package it.uiip.airport.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import it.uiip.airport.core.dao.PassengerDao;
import it.uiip.airport.core.model.PassengerModel;

/**
 * @author soprasteria
 *
 */
public class DefaultPassengerDao extends DefaultGenericDao<PassengerModel> implements PassengerDao
{

	/**
	 * @param typecode
	 */
	public DefaultPassengerDao(final String typecode)
	{
		super(typecode);
		// XXX Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see it.uiip.airport.core.dao.PassengerDao#findPassengerByFlightDay(java.lang.String)
	 */
	@Override
	public List<PassengerModel> findPassengersByFlightDay(final String day)
	{

		final StringBuilder queryString = new StringBuilder();
		queryString.append("SELECT {P.pk}");
		queryString.append("FROM {Passenger AS P");
		queryString.append("JOIN Pass2Rout AS PR ON {PR.passenger} = {P.pk}");
		queryString.append("JOIN Rout AS R ON {PR.route} = {R.pk}");
		queryString.append("JOIN Flight F ON {R.flight} = {F.pk}}");
		queryString.append("WHERE {F.weekday} = ?day");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryString);
		fsq.addQueryParameter("day", day);
		final SearchResult<PassengerModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}



}
