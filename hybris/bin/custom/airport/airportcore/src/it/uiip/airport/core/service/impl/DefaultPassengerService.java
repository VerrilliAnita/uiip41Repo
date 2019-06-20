package it.uiip.airport.core.service.impl;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;

import de.hybris.platform.servicelayer.user.impl.DefaultUserService;
import it.uiip.airport.core.dao.PassengerDao;
import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.service.PassengerService;



public class DefaultPassengerService extends DefaultUserService implements PassengerService{
	
	private PassengerDao passengerDao;
	
	@Override
	public List<PassengerModel> getPassengersForDate(Date date) {
	
		return passengerDao.findPassengersByDate(date);
	}

	public PassengerDao getPassengerDao() {
		return passengerDao;
	}
	
	@Required
	public void setPassengerDao(PassengerDao passengerDao) {
		this.passengerDao = passengerDao;
	}

	

	

}
