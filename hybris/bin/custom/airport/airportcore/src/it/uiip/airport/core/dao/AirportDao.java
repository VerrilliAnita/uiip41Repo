/**
 *
 */
package it.uiip.airport.core.dao;

import java.util.List;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;

import it.uiip.airport.core.model.AirportModel;


/**
 * @author soprasteria
 *
 */
public interface AirportDao extends GenericDao<AirportModel> {
	
	public List<AirportModel> findAirportByCity(String city);

}
