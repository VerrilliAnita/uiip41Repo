/**
 * 
 */
package it.uiip.airport.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.internal.dao.SortParameters;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;
import java.util.Map;

import it.uiip.airport.core.dao.PlaneDao;
import it.uiip.airport.core.model.AirportModel;
import it.uiip.airport.core.model.PlaneModel;

/**
 * @author soprasteria
 *
 */
public class DefaultPlaneDao extends DefaultGenericDao<PlaneModel> implements PlaneDao {

	public DefaultPlaneDao(String typecode) {
		super(typecode);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<PlaneModel> findPlanesByCity(String city) {
		StringBuilder queryStr= new StringBuilder();
		queryStr.append("SELECT * FROM {Plane as p JOIN Flight AS f"); 
		queryStr.append("ON {f.plane} = {p.PK} JOIN Route AS r"); 
		queryStr.append("ON {r.flight} = {f.PK} JOIN Airport AS a"); 
		queryStr.append("ON {f.airportArr} = {a.PK}}"); 
		queryStr.append("WHERE {a.city} = ?city");
		FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("city", city);
		SearchResult<PlaneModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}
	
}
