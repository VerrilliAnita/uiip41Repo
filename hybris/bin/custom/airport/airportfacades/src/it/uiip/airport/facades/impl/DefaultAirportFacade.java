package it.uiip.airport.facades.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import it.uiip.airport.core.model.AirportModel;
import it.uiip.airport.core.service.impl.DefaultAirportService;
import it.uiip.airport.facades.AirportFacade;
import it.uiip.airport.facades.data.AirportData;

public class DefaultAirportFacade implements AirportFacade {

	private Converter <AirportModel,AirportData> airportConverter;
	private DefaultAirportService airportService;

	public Converter<AirportModel, AirportData> getAirportConverter() {
		return airportConverter;
	}
	
	@Required
	public void setAirportConverter(Converter<AirportModel, AirportData> airportConverter) {
		this.airportConverter = airportConverter;
	}

	public DefaultAirportService getAirportService() {
		return airportService;
	}

	@Required
	public void setAirportService(DefaultAirportService airportService) {
		this.airportService = airportService;
	}

	@Override
	public List<AirportData> getAirportsForCity(String city) {
		
		return airportConverter.convertAll(airportService.getAirportsForCity(city));
	}

	@Override
	public List<AirportData> getAllAirports() {
		
		return airportConverter.convertAll(airportService.getAllAirports());
	}

}
