package it.uiip.airport.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import it.uiip.airport.core.dao.CabinCrewDao;
import it.uiip.airport.core.model.AirportModel;
import it.uiip.airport.core.model.CabinCrewModel;
import it.uiip.airport.core.model.CrewModel;
import it.uiip.airport.core.model.RouteModel;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

public class DefaultCabinCrewDao extends DefaultGenericDao<CabinCrewModel> implements CabinCrewDao {

	private static final Logger LOG = Logger.getLogger(DefaultCabinCrewDao.class);
	
	public DefaultCabinCrewDao(String typecode) {
		super(typecode);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<CabinCrewModel> findCabinCrewByMaxNumberOfRoutes() {
		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int monthInt = localDate.getMonthValue();
		String month = String.format("%02d", monthInt);
		
		LOG.info("call method ---> findCabinCrewByMaxNumberOfRoutes in DefaultCabinCrewDao class");
		final StringBuilder queryStr = new StringBuilder();
		queryStr.append("SELECT MAX({cc.pk}) FROM {CabinCrew AS cc ");
		queryStr.append("JOIN Crew AS c ON {cc.crew} = {c.pk} ");
		queryStr.append("JOIN Route AS r ON {c.pk} = {r.crew}} ");
		queryStr.append("WHERE {R.dateRouteDep} LIKE %-?month%");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("month", month);
		final SearchResult<CabinCrewModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}

	@Override
	public List<CabinCrewModel> findAllCabinCrew() {
		LOG.info("call method ---> findAllCabinCrew in DefaultCabinCrewDao class");
		final StringBuilder queryStr = new StringBuilder();
		queryStr.append("SELECT {cc.pk} FROM {CabinCrew AS cc} ");
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		final SearchResult<CabinCrewModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();
	}
	
	

	
}
