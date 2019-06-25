package it.uiip.airport.facades.populators;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;

import com.fasterxml.jackson.databind.util.Converter;
import com.thoughtworks.xstream.converters.ConversionException;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.storelocator.data.RouteData;
import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.model.RouteModel;
import it.uiip.airport.core.model.TicketModel;

public class TicketPopulator implements Populator<TicketModel, TicketData>
{
	private Converter<PassengerModel, PassengerData> passengerConverter;
	private Converter<RouteModel, RouteData> routeConverter;


	@Override
	public void populate(final TicketModel source, final TicketData target) throws ConversionException
	{
		target.setCodeTicket(source.getCodeTicket());
		target.setPassenger(passengerConverter.convert(source.getPassenger()));
		target.setRoute(routeConverter.convert(source.getRoute()));
		target.setPrice(source.getPrice());
		target.setSeat(source.getSeat());
	}


	/**
	 * @return the passengerConverter
	 */
	public Converter<PassengerModel, PassengerData> getPassengerConverter()
	{
		return passengerConverter;
	}

	@Required
	public void setPassengerConverter(final Converter<PassengerModel, PassengerData> passengerConverter)
	{
		this.passengerConverter = passengerConverter;
	}


	/**
	 * @return the routeConverter
	 */
	public Converter<RouteModel, RouteData> getRouteConverter()
	{
		return routeConverter;
	}


	@Required
	public void setRouteConverter(final Converter<RouteModel, RouteData> routeConverter)
	{
		this.routeConverter = routeConverter;
	}
