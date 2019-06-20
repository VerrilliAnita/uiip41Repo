package it.uiip.airport.facades.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import it.uiip.airport.core.model.AirportModel;
import it.uiip.airport.core.service.impl.DefaultAirportService;
import it.uiip.airport.facades.AirportFacade;
import it.uiip.airport.facades.data.AirportData;

public class DefaultAirportFacade implements AirportFacade {

	private Converter <AirportModel,AirportData> defaultAirportConverter;
	private DefaultAirportService defaultAirportService;
	
	
	public Converter<AirportModel, AirportData> getDefaultAirportConverter() {
		return defaultAirportConverter;
	}

	@Required
	public void setDefaultAirportConverter(Converter<AirportModel, AirportData> defaultAirportConverter) {
		this.defaultAirportConverter = defaultAirportConverter;
	}


	public DefaultAirportService getDefaultAirportService() {
		return defaultAirportService;
	}

	@Required
	public void setDefaultAirportService(DefaultAirportService defaultAirportService) {
		this.defaultAirportService = defaultAirportService;
	}


	@Override
	public List<AirportData> getAirportsForCity(String city) {
		
		return defaultAirportConverter.convertAll(defaultAirportService.getAirportsForCity(city));
	}

	@Override
	public List<AirportData> getAllAirports() {
		
		return defaultAirportConverter.convertAll(defaultAirportService.getAllAirports());
	}

}
