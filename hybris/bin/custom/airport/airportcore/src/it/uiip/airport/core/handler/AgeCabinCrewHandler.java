package it.uiip.airport.core.handler;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;
import it.uiip.airport.core.model.CabinCrewModel;

public class AgeCabinCrewHandler implements DynamicAttributeHandler<Integer, CabinCrewModel> {

	@Override
	public Integer get(CabinCrewModel cabinCrew) {
		return cabinCrew.getCurrentDate().getYear()-cabinCrew.getBirthday().getYear();
	}

	@Override
	public void set(CabinCrewModel arg0, Integer arg1) {
		// TODO Auto-generated method stub
		
	}

}
