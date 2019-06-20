package it.uiip.airport.core.dao;
import java.util.Date;
import java.util.List;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;

import it.uiip.airport.core.model.PassengerModel;

public interface PassengerDao extends GenericDao <PassengerModel> {
	
	public List <PassengerModel> findPassengersByDate(Date date);

}
