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
	public List<FlightModel> findFlightByDepartureCity(String city) {
		String queryString="SELECT {f.pk} \r\n" + 
				"	FROM {Flight AS f\r\n" + 
				"		JOIN Airport AS a ON {f.airportDep} = {a.pk}}\r\n" + 
				"		WHERE {a.city} = ?city";
		FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryString);
		fsq.addQueryParameter("city", city);
		SearchResult<FlightModel> result = getFlexibleSearchService().search(fsq);
		List<FlightModel> flight = result.getResult();
		return flight;
	}

	@Override
	public List<FlightModel> findFlightByDepartureDate(Date date) {
		String queryString="SELECT {f.pk} \r\n" + 
				"	FROM {Flight AS f\r\n" + 
				"		JOIN Route AS r ON {r.flight} = {f.pk}}\r\n" + 
				"        WHERE {r.dateRouteDep} LIKE '?date%'\r\n" + 
				"		";
		FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryString);
		fsq.addQueryParameter("date", date);
		SearchResult<FlightModel> result = getFlexibleSearchService().search(fsq);
		List<FlightModel> flight = result.getResult();
		return flight;
	}

}
