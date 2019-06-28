/**
 *
 */
package it.uiip.airport.core.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.dao.AirportRouteDao;
import it.uiip.airport.core.model.RouteModel;
import it.uiip.airport.core.service.AirportRouteService;


/**
 * @author soprasteria
 *
 */
public class DefaultAirportRouteService implements AirportRouteService
{
	private static final Map<String, ArrayList<RouteModel>> listPath = new HashMap<String, ArrayList<RouteModel>>();
	private static final Logger LOG = Logger.getLogger(DefaultAirportRouteService.class);
	private AirportRouteDao airportRouteDao;

	@Override
	public List<RouteModel> getAllRoutes()
	{
		LOG.info("Invoke method findAllAirportRoute in DefaultAirportRouteService");
		return airportRouteDao.findAllAirportRoute();
	}

	@Override
	public List<RouteModel> getRoutesForStatus(final String status)
	{
		LOG.info("Invoke method findAirportRouteDeleted in DefaultAirportRouteService");
		return airportRouteDao.findAirportRouteDeleted(status);
	}


	@Override
	public List<RouteModel> getRoutesForCode(final String codeRoute)
	{
		LOG.info("Invoke method findAirportRouteByCode in DefaultAirportRouteService");
		return airportRouteDao.findAirportRouteByCode(codeRoute);
	}

	/**
	 * @return the airportRouteDao
	 */
	public AirportRouteDao getAirportRouteDao()
	{
		return airportRouteDao;
	}


	@Required
	public void setAirportRouteDao(final AirportRouteDao airportRouteDao)
	{
		this.airportRouteDao = airportRouteDao;
	}


	@Override
	public Map<String, ArrayList<RouteModel>> getRoutesForCityAndDate(final String cityDep, final String cityArr, final Date date)
	{
		final String dateString = "" + date.getYear() + "-" + date.getMonth() + "-" + date.getDay();
		ricorsivo(null, cityDep, cityArr, new ArrayList<RouteModel>(), dateString);
		return listPath;
	}

	public void ricorsivo(final RouteModel r,final String cityDep, final String cityArr, final ArrayList<RouteModel> path, final String date)
	{
		if(r!=null)
		{
			path.add(r);
		}
		final List<RouteModel> routes = airportRouteDao.findAirportRouteByCityDep(cityDep, date);

		for (final RouteModel route : routes)
		{
			if (route.getFlight().getAirportArr().getCity().equals(cityArr))
			{
				if(path.size()==0)
				{
					listPath.put(route.getCodeRoute(), path );
				}
				else
				{
					if(path.get(path.size()-1).getDateRouteArr().after(route.getDateRouteDep()))
					{
						listPath.put(route.getCodeRoute(), path);//aggiungere r
					}
				}
			}
			else
			{
				if (true)
				{
					ricorsivo(r,route.getFlight().getAirportArr().getCity(), cityArr, path, date);
				}
			}
		}
		return;
	}

}
