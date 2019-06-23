package it.uiip.airport.facades.populators;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.model.RouteModel;
import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.facades.data.PassengerData;
import it.uiip.airport.facades.data.RouteData;
import it.uiip.airport.facades.data.TicketData;
import de.hybris.platform.servicelayer.dto.converter.Converter;

public class TicketPlanePopulator implements Populator<TicketModel, TicketData>{
	
	private static final Logger LOG = Logger.getLogger(TicketPlanePopulator.class);

	@Resource
	private Converter<RouteModel, RouteData> routeConverter;
	
	@Resource
	private Converter<PassengerModel, PassengerData> passengerConverter;
	
	@Override
	public void populate(TicketModel source, TicketData target) throws ConversionException {
		LOG.info("call method populate in TicketPopulator");
		target.setCodeTicket(source.getCodeTicket());
		target.setAirlineCompany(source.getAirlineCompany());
		target.setRoute(routeConverter.convert(source.getRoute()));
		target.setPassenger(passengerConverter.convert(source.getPassenger()));
		target.setClassTicket(source.getClassTicket());
		target.setFlightTime(source.getFlightTime());
		target.setPrice(source.getPrice());
		target.setSeatNumber(source.getSeatNumber());
	}

	public Converter<RouteModel, RouteData> getRouteConverter() {
		return routeConverter;
	}

	@Required
	public void setRouteConverter(Converter<RouteModel, RouteData> routeConverter) {
		this.routeConverter = routeConverter;
	}

	public Converter<PassengerModel, PassengerData> getPassengerConverter() {
		return passengerConverter;
	}

	@Required
	public void setPassengerConverter(Converter<PassengerModel, PassengerData> passengerConverter) {
		this.passengerConverter = passengerConverter;
	}
	
	

}
