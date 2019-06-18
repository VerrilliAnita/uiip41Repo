/**
 *
 */
package it.uiip.airport.core.handler.impl;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;

import java.util.Date;

import it.uiip.airport.core.model.PasseggeroModel;


/**
 * @author soprasteria
 *
 */
public class DynamicAgePassengerImpl implements DynamicAttributeHandler<Integer, PasseggeroModel>
{

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler#get(de.hybris.platform.servicelayer.model.
	 * AbstractItemModel)
	 */
	@Override
	public Integer get(final PasseggeroModel model)
	{
		return model.getCurrentDate().getYear() - new Date(model.getDataNascita()).getYear();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler#set(de.hybris.platform.servicelayer.model.
	 * AbstractItemModel, java.lang.Object)
	 */
	@Override
	public void set(final PasseggeroModel model, final Integer arg1)
	{
		model.setEta(arg1);
	}

}
