/**
 *
 */
package it.uiip.airport.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.model.FlightModel;
import it.uiip.airport.core.model.RouteModel;
import it.uiip.airport.facades.data.FlightData;
import it.uiip.airport.facades.data.RouteData;




/**
 * @author soprasteria
 *
 */
public class RoutePopulator implements Populator<RouteModel, RouteData>
{
	private Converter<FlightModel, FlightData> flightConverter;

	@Override
	public void populate(final RouteModel source, final RouteData target) throws ConversionException
	{
		target.setCodeRoute(source.getCodeRoute());
		target.setFlight(flightConverter.convert(source.getFlight()));
		target.setDateRouteDep(source.getDateRouteDep());
		target.setDateRouteArr(source.getDateRouteArr());

	}

	public Converter<FlightModel, FlightData> getFlightConverter()
	{
		return flightConverter;
	}


	@Required
	public void setFlightConverter(final Converter<FlightModel, FlightData> flightConverter)
	{
		this.flightConverter = flightConverter;
	}

}
