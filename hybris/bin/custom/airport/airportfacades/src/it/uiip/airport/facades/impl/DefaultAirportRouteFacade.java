/**
 *
 */
package it.uiip.airport.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.model.RouteModel;
import it.uiip.airport.core.service.AirportRouteService;
import it.uiip.airport.facades.AirportRouteFacade;
import it.uiip.airport.facades.data.AirportRouteData;


/**
 * @author soprasteria
 *
 */
public class DefaultAirportRouteFacade implements AirportRouteFacade
{
	private AirportRouteService airportRouteService;
	private Converter<RouteModel, AirportRouteData> airportRouteConverter;

	@Override
	public List<AirportRouteData> getAllRoutes()
	{
		return airportRouteConverter.convertAll(airportRouteService.getAllRoutes());
	}

	@Override
	public Map<String, List<AirportRouteData>> getRouteAirportAToAirportB(final String cityDep, final String cityArr,
			final Date date)
	{
		final Map<String, ArrayList<RouteModel>> routesModel = airportRouteService.getRoutesForCityAndDate(cityDep, cityArr, date);
		final Map<String, List<AirportRouteData>> result = new HashMap<String, List<AirportRouteData>>();

		for (final Map.Entry<String, ArrayList<RouteModel>> entry : routesModel.entrySet())
		{
			result.put(entry.getKey(), airportRouteConverter.convertAll(entry.getValue()));
		}
		return result;
	}

	@Override
	public List<AirportRouteData> getRoutesForCode(final String codeRoute)
	{
		return airportRouteConverter.convertAll(airportRouteService.getRoutesForCode(codeRoute));
	}

	public AirportRouteService getAirportRouteService()
	{
		return airportRouteService;
	}

	@Required
	public void setAirportRouteService(final AirportRouteService airportRouteService)
	{
		this.airportRouteService = airportRouteService;
	}

	public Converter<RouteModel, AirportRouteData> getAirportRouteConverter()
	{
		return airportRouteConverter;
	}

	@Required
	public void setAirportRouteConverter(final Converter<RouteModel, AirportRouteData> airportRouteConverter)
	{
		this.airportRouteConverter = airportRouteConverter;
	}

}
