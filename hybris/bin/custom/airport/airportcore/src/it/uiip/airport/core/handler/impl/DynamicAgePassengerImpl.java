package it.uiip.airport.core.handler.impl;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;

import java.util.Date;

import it.uiip.airport.core.model.PasseggeroModel;


public class DynamicAgePassengerImpl implements DynamicAttributeHandler<Integer, PasseggeroModel> {

	@Override
	public Integer get(final PasseggeroModel model)
	{
		return model.getCurrentDate().getYear() - new Date(model.getDataDiNascita()).getYear();
	}

	@Override
	public void set(final PasseggeroModel model, final Integer arg1)
	{
		model.setEta(arg1);
	}

}
