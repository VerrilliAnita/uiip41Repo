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
	public List<PlaneModel> findPlaneByArrivalCity(String city) {
		String queryStr="\r\n" + 
				"SELECT {p.PK} FROM { plane AS p\r\n" + 
				"	JOIN Flight AS f ON {p.pk} = {f.plane}\r\n" + 
				"    	JOIN Route AS r ON {r.flight} = {f.pk}\r\n" + 
				"        	JOIN Airport AS a ON {a.pk} = {f.airportArr}\r\n" + 
				"}	WHERE {a.city} = ?city";
		FlexibleSearchQuery fsq = new FlexibleSearchQuery( queryStr );
		fsq.addQueryParameter("?city", city);

		SearchResult<PlaneModel> result = getFlexibleSearchService().search( fsq );
		List<PlaneModel> plane = result.getResult();
		return plane;

	}

}
