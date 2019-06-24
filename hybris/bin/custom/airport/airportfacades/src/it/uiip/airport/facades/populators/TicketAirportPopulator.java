package it.uiip.airport.facades.populators;

import org.springframework.beans.factory.annotation.Required;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import it.uiip.airport.core.model.TicketAirportModel;
import it.uiip.airport.facades.data.TicketAirportData;
import it.uiip.airport.core.model.RouteModel;
import it.uiip.airport.facades.data.RouteData;
import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.facades.data.PassengerData;

public class TicketAirportPopulator implements Populator <TicketAirportModel,TicketAirportData>{
	
	private Converter<RouteModel,RouteData>routePlaneConverter;
	private Converter<PassengerModel,PassengerData>passengerConverter;

	@Override
	public void populate(TicketAirportModel source, TicketAirportData target) throws ConversionException {
		target.setCodeTicketAirport(source.getCodeTicketAirport());
		target.setRoute(routePlaneConverter.convert(source.getRoute()));
		target.setPassenger(passengerConverter.convert(source.getPassenger()));
		target.setIdSit(source.getIdSit());
		target.setPrice(source.getPrice());	
	}

	public Converter<RouteModel, RouteData> getRoutePlaneConverter() {
		return routePlaneConverter;
	}
	@Required
	public void setRoutePlaneConverter(Converter<RouteModel, RouteData> routePlaneConverter) {
		this.routePlaneConverter = routePlaneConverter;
	}

	public Converter<PassengerModel, PassengerData> getPassengerConverter() {
		return passengerConverter;
	}
	@Required
	public void setPassengerConverter(Converter<PassengerModel, PassengerData> passengerConverter) {
		this.passengerConverter = passengerConverter;
	}
	

}
