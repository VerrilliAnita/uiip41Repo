package it.uiip.airport.facades.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import it.uiip.airport.core.model.RouteModel;
import it.uiip.airport.core.service.RoutePlaneService;
import it.uiip.airport.facades.RoutePlaneFacade;

import it.uiip.airport.facades.data.RouteData;

public class DefaultRoutePlaneFacade implements RoutePlaneFacade{
	
	private RoutePlaneService routePlaneService; 
	
	private Converter<RouteModel,RouteData>routePlaneConverter;
	
	@Override
	public List<RouteData> getAllRoutes() {
		return routePlaneConverter.convertAll(routePlaneService.getAllRoutes());
	}

	@Override
	public RouteData getRouteForFlight(String codeFlight) {
		return routePlaneConverter.convert(routePlaneService.getRouteForFlight(codeFlight));
	}
	
	@Override
	public RouteData getRouteForCodeRoute(String codeRoute) {
		return routePlaneConverter.convert(routePlaneService.getRouteForCodeRoute(codeRoute));
	}

	public RoutePlaneService getRoutePlaneService() {
		return routePlaneService;
	}
	
	@Required
	public void setRoutePlaneService(RoutePlaneService routePlaneService) {
		this.routePlaneService = routePlaneService;
	}

	public Converter<RouteModel, RouteData> getRoutePlaneConverter() {
		return routePlaneConverter;
	}
	
	@Required
	public void setRoutePlaneConverter(Converter<RouteModel, RouteData> routePlaneConverter) {
		this.routePlaneConverter = routePlaneConverter;
	}

	
	
	

}
