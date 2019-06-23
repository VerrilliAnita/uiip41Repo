package it.uiip.airport.facades.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import it.uiip.airport.core.model.RouteModel;
import it.uiip.airport.core.service.RoutePlaneService;
import it.uiip.airport.facades.RoutePlaneFacade;
import it.uiip.airport.facades.data.RouteData;

public class DefaultRoutePlaneFacade implements RoutePlaneFacade {
	
	private static final Logger LOG = Logger.getLogger(DefaultRoutePlaneFacade.class);

	@Resource
	private RoutePlaneService routePlaneService;

	@Resource
	private Converter<RouteModel, RouteData> routeConverter;
	
	@Override
	public RouteData getRouteForFlight(String codeFlight) {
		LOG.info("call method --> getRouteForFlight(String codeFlight) in DefaultRouteFacade");
		return routeConverter.convert(routePlaneService.getRouteForFlight(codeFlight));
	}

	public RoutePlaneService getRouteService() {
		return routePlaneService;
	}

	@Required
	public void setRoutePlaneService(RoutePlaneService routePlaneService) {
		this.routePlaneService = routePlaneService;
	}

	public Converter<RouteModel, RouteData> getRouteConverter() {
		return routeConverter;
	}
	
	@Required
	public void setRouteConverter(Converter<RouteModel, RouteData> routeConverter) {
		this.routeConverter = routeConverter;
	}
	
	

}
