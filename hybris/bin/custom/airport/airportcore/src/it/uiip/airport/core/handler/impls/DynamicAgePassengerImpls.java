package it.uiip.airport.core.handler.impls;

import java.util.Date;


import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;
import it.uiip.airport.core.model.PasseggeroModel;




public class DynamicAgePassengerImpls implements DynamicAttributeHandler<Integer, PasseggeroModel>{

	@Override
	public Integer get(PasseggeroModel passeggero) {
		 return passeggero.getCurrentDate().getYear()- new Date(passeggero.getDatadinascita()).getYear();
	}

	@Override
	public void set(PasseggeroModel passeggero, Integer year) {
		passeggero.setEta(year);
	}

	

	

	

	



		
}
