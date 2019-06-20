package it.uiip.airport.core.service;

import java.util.Date;
import java.util.List;

import de.hybris.platform.servicelayer.user.UserService;
import it.uiip.airport.core.model.PassengerModel;

public interface PassengerService extends UserService{
	
	public List <PassengerModel> getPassengersForDate(Date date);

}
