package it.uiip.airport.core.service;

import java.util.List;

import it.uiip.airport.core.model.FlightModel;

public interface FlightService {
	
	public List<FlightModel> getFlightsForCity(String city);
	public List<FlightModel> getFlightsForDate(String date);

}
