package it.uiip.airport.facades;

import java.util.List;

import it.uiip.airport.facades.data.AirportData;

public interface AirportFacade {
	
	public List<AirportData> getAllAirports();

	public List<AirportData> getAirportsForCity(String city);
	
	

}
