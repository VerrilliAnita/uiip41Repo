package it.uiip.airport.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import it.uiip.airport.core.model.AirportModel;
import it.uiip.airport.facades.data.AirportData;

public class AirportPopulator implements Populator<AirportModel,AirportData>{

	@Override
	public void populate(AirportModel source, AirportData target) throws ConversionException {
		target.setCodeAirport(source.getCodeAirport());
		target.setName(source.getName());
		target.setCity(source.getCity());
		target.setCountry(source.getCountry());
		target.setRanways(source.getRunways());
	}

}
