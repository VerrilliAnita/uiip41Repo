/**
 * 
 */
package it.uiip.airport.core.dao.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import it.uiip.airport.core.dao.FlightDao;
import it.uiip.airport.core.model.FlightModel;

/**
 * @author soprasteria
 *
 */
public class DefaultFlightDao extends DefaultGenericDao<FlightModel> implements FlightDao{
	
	public DefaultFlightDao(String typecode) {
		super(typecode);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<FlightModel> findFlightsByDepartureCity(String city) {
		StringBuilder queryStr= new StringBuilder();
		queryStr.append("SELECT {f.pk}");
		queryStr.append("FROM {Flight AS f");
		queryStr.append("JOIN Airport AS a ON {f.airportDep} = {a.pk}}"); 
		queryStr.append("WHERE {a.city} = ?city");
		FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("city", city);
		SearchResult<FlightModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}

	@Override
	public List<FlightModel> findFlightsByDepartureDate(Date date) {
		StringBuilder queryStr= new StringBuilder();
		queryStr.append("SELECT {f.pk}"); 
		queryStr.append("FROM {Flight AS f"); 
		queryStr.append("JOIN Route AS r ON {r.flight} = {f.pk}}"); 
		queryStr.append("WHERE {r.dateRouteDep} LIKE '?date%'");
		FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("date", date);
		SearchResult<FlightModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}

}
