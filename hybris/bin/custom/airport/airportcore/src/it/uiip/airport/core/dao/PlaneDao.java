/**
 *
 */
package it.uiip.airport.core.dao;

import java.util.List;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;

import it.uiip.airport.core.model.PlaneModel;


/**
 * @author soprasteria
 *
 */
public interface PlaneDao extends GenericDao<PlaneModel> {
	
	public List<PlaneModel> findPlaneByCity(String city);
}
