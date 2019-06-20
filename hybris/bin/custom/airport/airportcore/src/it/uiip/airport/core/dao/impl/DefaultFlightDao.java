package it.uiip.airport.core.dao.impl;

import java.util.List;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import it.uiip.airport.core.dao.FlightDao;
import it.uiip.airport.core.model.FlightModel;

public class DefaultFlightDao extends DefaultGenericDao<FlightModel> implements FlightDao {


	public DefaultFlightDao(String typecode) {
		super(typecode);
	}

	@Override
	public List<FlightModel> findFlightsByCity(String city) {
		StringBuilder queryStr=new StringBuilder();
		queryStr.append("SELECT {f.PK} FROM { ") ;
		queryStr.append("Flight AS f JOIN Airport AS a ON {f.airportDep} = {a.pk}") ;
		queryStr.append("} WHERE {a.city} = '?city'") ;
		FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("city", city);
		SearchResult<FlightModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}

	@Override
	public List<FlightModel> findFlightsByDate(String date) {
		StringBuilder queryStr=new StringBuilder();
		queryStr.append("SELECT {f.PK} FROM { Flight AS f ") ;
		queryStr.append("	JOIN Route AS r ON {f.pk} = {r.flight}") ;
		queryStr.append("} WHERE {r.dateRouteDep} LIKE '?date%'") ;
		
	
		FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("date", date);
		SearchResult<FlightModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}
	
	

}
