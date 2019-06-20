package it.uiip.airport.core.service.impl;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import de.hybris.platform.servicelayer.user.impl.DefaultUserService;
import it.uiip.airport.core.dao.PassengerDao;
import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.service.PassengerService;



public class DefaultPassengerService extends DefaultUserService implements PassengerService{
	
	private PassengerDao passengerDao;
	
	private static final Logger LOG = Logger.getLogger(DefaultFlightService.class);

	
	@Override
	public List<PassengerModel> getPassengersForDate(Date date) {
		LOG.info("Find passengers by date");
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
