package it.uiip.airport.core.dao.impl;


import java.util.List;
import java.util.Map;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.internal.dao.SortParameters;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import it.uiip.airport.core.dao.FlightRouteDao;

public class DefaultFlightRouteDao extends DefaultGenericDao<FlightRouteModel> implements FlightRouteDao {
	
	/**
	 * @param typecode
	 */
	public DefaultFlightRouteDao(final String typecode)
	{
		super(typecode);
	}


	@Override
	public List<FlightRouteModel> findRouteByCode(String codeRoute) {
		final StringBuilder queryStr = new StringBuilder();
		queryStr.append("SELECT {R.PK} FROM {Route as R");
		queryStr.append("WHERE {R.codeRoute} = ?codeRoute");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("codeRoute", codeRoute);
		final SearchResult<FlightRouteModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}

}
