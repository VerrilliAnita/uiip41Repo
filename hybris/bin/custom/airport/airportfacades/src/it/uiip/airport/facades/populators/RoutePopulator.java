package it.uiip.airport.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import it.uiip.airport.core.model.FlightModel;
import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.model.RouteModel;
import it.uiip.airport.facades.data.FlightData;
import it.uiip.airport.facades.data.PassengerData;
import it.uiip.airport.facades.data.RouteData;
public class RoutePopulator implements Populator<RouteModel,RouteData>{
	
	private Converter<FlightModel, FlightData> flightConverter;
	private Converter<PassengerModel,PassengerData>passengerConverter;
	@Override
	public void populate(RouteModel source, RouteData target) throws ConversionException {
		target.setCodeRoute(source.getCodeRoute());
		target.setFlight(flightConverter.convert(source.getFlight()));
		target.setDateRouteDep(source.getDateRouteDep());
		target.setDateRouteArr(source.getDateRouteArr());
		
	}
	
	

}
