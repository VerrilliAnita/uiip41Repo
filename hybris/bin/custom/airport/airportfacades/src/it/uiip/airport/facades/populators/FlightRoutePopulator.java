package it.uiip.airport.facades.populators;

import org.springframework.beans.factory.annotation.Required;

import com.thoughtworks.xstream.converters.ConversionException;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import it.uiip.airport.core.model.AirportTicketModel;
import it.uiip.airport.core.model.FlightModel;
import it.uiip.airport.core.model.FlightRouteModel;
import it.uiip.airport.facades.data.AirportTicketData;
import it.uiip.airport.facades.data.FlightData;
import it.uiip.airport.facades.data.FlightRouteData;

public class FlightRoutePopulator implements Populator<FlightRouteModel, FlightRouteData>
{
	private Converter<FlightModel, FlightData> flightConverter;
	private Converter<AirportTicketModel, AirportTicketData> airportTicketConverter;

	@Override
	public void populate(final FlightRouteModel source, final FlightRouteData target) throws ConversionException
	{
		target.setCodeRoute(source.getCodeRoute());
		target.setFlight(flightConverter.convert(source.getFlight()));
		target.setDateRouteDep(source.getDateRouteDep());
		target.setDateRouteArr(source.getDateRouteArr());
		//target.setAirportTicket(airportTicketConverter.convert(source.get()));

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
	
	public Converter<AirportTicketModel, AirportTicketData> getAirportTicketConverter()
	{
		return airportTicketConverter;
	}

	@Required
	public void setAirportTicketConverter(final Converter<AirportTicketModel, AirportTicketData> airportTicketConverter)
	{
		this.airportTicketConverter = airportTicketConverter;
	}
	
}
