/**
 *
 */
package it.uiip.airport.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.Date;
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
	public List<PassengerModel> findPassengersByFlightDate(final Date date)
	{

		final StringBuilder queryStr = new StringBuilder();
		queryStr.append("SELECT {P:PK}");
		queryStr.append("FROM{Passenger as P JOIN PassengerRouteRelation as rel");
		queryStr.append("ON {P:PK} = {rel:source}");
		queryStr.append("JOIN Route AS R ON {rel:target} = {R:PK}");
		queryStr.append("} WHERE {R.dateRouteDep} LIKE '?date'");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("date", date);
		final SearchResult<PassengerModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see it.uiip.airport.core.dao.PassengerDao#findAllPassengers()
	 */
	@Override
	public List<PassengerModel> findAllPassengers()
	{
		
		final StringBuilder queryStr = new StringBuilder();
		queryStr.append("SELECT {P:PK}");
		queryStr.append("FROM{Passenger as P}}");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		final SearchResult<PassengerModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}
	

	@Override
	public PassengerModel findPassengerById(String passengerId) {
		final StringBuilder queryStr = new StringBuilder();
		queryStr.append("SELECT {p.pk} FROM { Passenger AS p ");
		queryStr.append("} WHERE {p.uid} = ?passengerId");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("passengerId", passengerId);
		final SearchResult<PassengerModel> result = getFlexibleSearchService().search(fsq);
		if(result.getResult().isEmpty())
			return null;
		return result.getResult().get(0);
	}


	@Override
	public List<PassengerModel> findPassengersByRoute(String codeRoute) {
		final StringBuilder queryStr = new StringBuilder();
		queryStr.append("SELECT {P:PK},{T.idSit}");
		queryStr.append("FROM{Passenger as P JOIN PassengerRouteRelation as rel");
		queryStr.append("ON {P:PK} = {rel:source}");
		queryStr.append("JOIN Route AS R ON {rel:target} = {R:PK}");
		queryStr.append("JOIN Ticket AS T ON {R:PK} ={T.route}");
		queryStr.append("} WHERE {R.codeRoute} LIKE '?codeRoute'");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("codeRoute", codeRoute);
		final SearchResult<PassengerModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}



}
