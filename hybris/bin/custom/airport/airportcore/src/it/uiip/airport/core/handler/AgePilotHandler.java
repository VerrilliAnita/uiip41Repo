package it.uiip.airport.core.handler;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;
import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.model.PilotModel;

public class AgePilotHandler implements DynamicAttributeHandler<Integer, PilotModel> {

	@Override
	public Integer get(PilotModel pilot) {
		return pilot.getCurrentDate().getYear()-pilot.getBirthday().getYear();
	}

	@Override
	public void set(PilotModel pilot, Integer age) {
		
	}

}
