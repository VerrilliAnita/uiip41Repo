package it.uiip.airport.facades.populators;

import org.springframework.beans.factory.annotation.Required;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import it.uiip.airport.core.model.FlightModel;
import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.model.RouteModel;
import it.uiip.airport.core.model.TicketAirportModel;
import it.uiip.airport.facades.data.FlightData;
import it.uiip.airport.facades.data.PassengerData;
import it.uiip.airport.facades.data.RouteData;
import it.uiip.airport.facades.data.TicketAirportData;
public class RoutePlanePopulator implements Populator<RouteModel,RouteData>{
	
	private Converter<FlightModel, FlightData> flightConverter;

	private Converter<TicketAirportModel, TicketAirportData> ticketAirportConverter;
	
	@Override
	public void populate(RouteModel source, RouteData target) throws ConversionException {
		target.setCodeRoute(source.getCodeRoute());
		target.setFlight(flightConverter.convert(source.getFlight()));
		target.setDateRouteDep(source.getDateRouteDep());
		target.setDateRouteArr(source.getDateRouteArr());
		target.setTickets(ticketAirportConverter.convertAll(source.getTickets()));
		
	}
	public Converter<FlightModel, FlightData> getFlightConverter() {
		return flightConverter;
	}
	@Required
	public void setFlightConverter(Converter<FlightModel, FlightData> flightConverter) {
		this.flightConverter = flightConverter;
	}
	
	public Converter<TicketAirportModel, TicketAirportData> getTicketAirportConverter() {
		return ticketAirportConverter;
	}
	@Required
	public void setTicketAirportConverter(Converter<TicketAirportModel, TicketAirportData> ticketAirportConverter) {
		this.ticketAirportConverter = ticketAirportConverter;
	}
	
	
	

}
