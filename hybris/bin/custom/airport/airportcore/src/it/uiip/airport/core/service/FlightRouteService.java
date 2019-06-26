package it.uiip.airport.core.service;

import java.util.List;

import it.uiip.airport.core.model.FlightRouteModel;


public interface FlightRouteService {
	
	public List<FlightRouteModel> getRoutesForCode(String codeRoute);

}
