/**
 *
 */
package it.uiip.airport.facades.populators;

import org.springframework.beans.factory.annotation.Required;

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

	public Converter<AirportModel, AirportData> getAirportConverter() {
		return airportConverter;
	}

	@Required
	public void setAirportConverter(Converter<AirportModel, AirportData> airportConverter) {
		this.airportConverter = airportConverter;
	}
	
	public Converter<PlaneModel, PlaneData> getPlaneConverter() {
		return planeConverter;
	}

	@Required
	public void setPlaneConverter(Converter<PlaneModel, PlaneData> planeConverter) {
		this.planeConverter = planeConverter;
	}

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
