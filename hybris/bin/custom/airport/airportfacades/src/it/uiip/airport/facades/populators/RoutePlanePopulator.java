package it.uiip.airport.facades.populators;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import it.uiip.airport.core.model.FlightModel;
import it.uiip.airport.core.model.RouteModel;
import it.uiip.airport.facades.data.FlightData;
import it.uiip.airport.facades.data.RouteData;

public class RoutePlanePopulator implements Populator<RouteModel, RouteData> {
	
	private static final Logger LOG = Logger.getLogger(RoutePlanePopulator.class);

	@Resource
	private Converter<FlightModel, FlightData> flightConverter;
	
	@Override
	public void populate(RouteModel source, RouteData target) throws ConversionException {
		LOG.info("call method populate in RoutePopulator");
		target.setCodeRoute(source.getCodeRoute());
		target.setFlight(flightConverter.convert(source.getFlight()));
		target.setDateRouteDep(source.getDateRouteDep());
		target.setDateRouteArr(source.getDateRouteArr());
	}

	public Converter<FlightModel, FlightData> getFlightConverter() {
		return flightConverter;
	}

	@Required
	public void setFlightConverter(Converter<FlightModel, FlightData> flightConverter) {
		this.flightConverter = flightConverter;
	}

	
	
}
