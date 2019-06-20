/**
 *
 */
package it.uiip.airport.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import it.uiip.airport.core.model.AirportModel;
import it.uiip.airport.core.model.FlightModel;
import it.uiip.airport.core.model.PlaneModel;
import it.uiip.airport.facades.data.AirportData;
import it.uiip.airport.facades.data.FlightData;
import it.uiip.airport.facades.data.PlaneData;


/**
 * @author soprasteria
 *
 */
public class FlightPopulator implements Populator<FlightModel, FlightData>
{
	private Converter<AirportModel, AirportData> airportConverter;
	private Converter<PlaneModel, PlaneData> planeConverter;

	@Override
	public void populate(final FlightModel source, final FlightData target) throws ConversionException
	{
		target.setCodeFlight(source.getCodeFlight());
		target.setWeekDay(source.getWeekDay().toString());
		target.setAirportDep(airportConverter.convert(source.getAirportDep()));
		target.setAirportArr(airportConverter.convert(source.getAirportArr()));
		target.setPlane(planeConverter.convert(source.getPlane()));
		target.setTimeDep(source.getTimeDep());
		target.setTimeArr(source.getTimeArr());
	}

}
