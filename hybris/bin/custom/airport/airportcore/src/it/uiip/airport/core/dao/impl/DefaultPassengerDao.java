package it.uiip.airport.core.dao.impl;

import java.util.Date;
import java.util.List;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.dao.PassengerDao;

public class DefaultPassengerDao extends DefaultGenericDao<PassengerModel> implements PassengerDao{

	public DefaultPassengerDao(String typecode) {
		super(typecode);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<PassengerModel> findPassengersByDate(Date date) {
		StringBuilder queryStr=new StringBuilder();
		queryStr.append("SELECT {P:PK}") ;
		queryStr.append("FROM{Passenger as P JOIN Passenger2RouteRelation as rel") ;
		queryStr.append("ON {P:PK} = {rel:source}"); 
		queryStr.append("JOIN Route AS R ON {rel:target} = {R:PK}");
		queryStr.append("} WHERE {R.dateRouteDep} LIKE '?date'") ;
		FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("date", date);
		SearchResult<PassengerModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}

}
