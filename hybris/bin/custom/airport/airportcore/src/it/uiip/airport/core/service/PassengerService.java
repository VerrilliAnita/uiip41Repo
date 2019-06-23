/**
 *
 */
package it.uiip.airport.core.service;

import de.hybris.platform.servicelayer.user.UserService;

import java.util.Date;
import java.util.List;

import it.uiip.airport.core.model.PassengerModel;


/**
 * @author soprasteria
 *
 */
public interface PassengerService extends UserService
{
	public List<PassengerModel> getPassengersForDate(Date date);
	public List<PassengerModel> getPassengersForRoute(String codeRoute);

	public List<PassengerModel> getAllPassengers();
	public PassengerModel getPassengerForId(String uid);
}
