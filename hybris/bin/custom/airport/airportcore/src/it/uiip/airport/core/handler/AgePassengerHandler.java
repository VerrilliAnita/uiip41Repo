package it.uiip.airport.core.handler;

import java.util.Date;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;
import it.uiip.airport.core.model.PasseggeroModel;

public class AgePassengerHandler implements DynamicAttributeHandler<String, PasseggeroModel> {

	
	@Override
	public String get(PasseggeroModel passeggero) {
		return Integer.toString(passeggero.getCurrentDate().getYear() - new Date(passeggero.getDataNascita()).getYear());
	}

	@Override
	public void set(PasseggeroModel passeggero, String eta) {
		// TODO Auto-generated method stub
		//passeggero.setEta(Integer.parseInt(eta));
	}

}
