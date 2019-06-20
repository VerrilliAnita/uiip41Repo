package it.uiip.airport.core.dao.impl;

import java.util.List;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import it.uiip.airport.core.dao.PlaneDao;
import it.uiip.airport.core.model.PlaneModel;

public class DefaultPlaneDao extends DefaultGenericDao<PlaneModel> implements PlaneDao {

	public DefaultPlaneDao(String typecode) {
		super(typecode);
		
	}

	@Override
	public List<PlaneModel> findPlanesByArrivalCity(String city) {
		StringBuilder queryStr=new StringBuilder();
		queryStr.append("SELECT {p.PK} FROM { plane AS p") ;
		queryStr.append("    	JOIN Route AS r ON {r.flight} = {f.pk}") ;
		queryStr.append("        	JOIN Airport AS a ON {a.pk} = {f.airportArr}") ;
		queryStr.append("}	WHERE {a.city} = ?city") ;
	
		FlexibleSearchQuery fsq = new FlexibleSearchQuery( queryStr );
		fsq.addQueryParameter("?city", city);

		SearchResult<PlaneModel> result = getFlexibleSearchService().search( fsq );
		return 	result.getResult();

	}

}
