package it.uiip.airport.core.dao.impl;


import java.util.List;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import it.uiip.airport.core.dao.AirportDao;
import it.uiip.airport.core.model.AirportModel;

public class DefaultAirportDao extends DefaultGenericDao<AirportModel>implements AirportDao{

	public DefaultAirportDao(String typecode) {
		super(typecode);
	}

	@Override
	public List<AirportModel> findAirportsByCity(String city) {
		
		String queryStr = "SELECT {a.PK} FROM {Airport AS a } WHERE {a.city} = ?city";
		FlexibleSearchQuery fsq= new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("city", city);
		SearchResult<AirportModel>result = getFlexibleSearchService().search(fsq);
		return 	result.getResult();
	}

	@Override
	public List<AirportModel> findAllAirports() {
		String queryStr = "SELECT * FROM {Airport AS a }";
		FlexibleSearchQuery fsq= new FlexibleSearchQuery(queryStr);
		SearchResult<AirportModel>result = getFlexibleSearchService().search(fsq);
		return 	result.getResult();
	}

}
