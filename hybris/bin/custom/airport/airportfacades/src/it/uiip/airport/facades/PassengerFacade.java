package it.uiip.airport.facades;

import java.util.Date;
import java.util.List;

import it.uiip.airport.facades.data.PassengerData;

public interface PassengerFacade {
	
	public List <PassengerData> getPassengersForDate(Date date);
	public List<PassengerData> getPassengersForRoute(String codeRoute);
	public PassengerData getPassengerForId(String uid);
	
}
