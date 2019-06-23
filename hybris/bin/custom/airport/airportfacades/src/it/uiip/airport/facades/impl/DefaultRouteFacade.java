package it.uiip.airport.facades.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import it.uiip.airport.core.model.RouteModel;
import it.uiip.airport.core.service.RouteService;
import it.uiip.airport.facades.RouteFacade;

import it.uiip.airport.facades.data.RouteData;

public class DefaultRouteFacade implements RouteFacade{
	
	private RouteService routeService; 
	
	private Converter<RouteModel, RouteData> routeConverter;
	@Override
	public List<RouteData> getAllRoutes() {
		return routeConverter.convertAll(routeService.getAllRoutes());
	}

	@Override
	public RouteData getRouteForFlight(String codeFlight) {
		return routeConverter.convert(routeService.getRouteForFlight(codeFlight));
	}

	public RouteService getRouteService() {
		return routeService;
	}
	
	@Required
	public void setRouteService(RouteService routeService) {
		this.routeService = routeService;
	}

	public Converter<RouteModel, RouteData> getRouteConverter() {
		return routeConverter;
	}
	
	@Required
	public void setRouteConverter(Converter<RouteModel, RouteData> routeConverter) {
		this.routeConverter = routeConverter;
	}
	
	

}
