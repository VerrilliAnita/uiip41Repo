package it.uiip.airport.core.service;

import java.util.List;

import it.uiip.airport.core.model.AirportModel;

public interface AirportService {
		
	public List <AirportModel> getAirportsForCity(String city);
	
	public List <AirportModel> getAllAirports();
}
