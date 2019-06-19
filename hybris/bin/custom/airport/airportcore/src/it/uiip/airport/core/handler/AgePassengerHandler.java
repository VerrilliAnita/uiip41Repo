package it.uiip.airport.core.handler;

import java.util.Date;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;

import it.uiip.airport.core.model.PasseggeroModel;

public class AgePassengerHandler implements DynamicAttributeHandler<Integer, PasseggeroModel>{

	@Override
	public Integer get(PasseggeroModel passeggero) {
		return passeggero.getCurrentDate().getYear()-passeggero.getDataNascita().getYear();
	}

	@Override
	public void set(PasseggeroModel passeggero, Integer eta) {

	}

}
