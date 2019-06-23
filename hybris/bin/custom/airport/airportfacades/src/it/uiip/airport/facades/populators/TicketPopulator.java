package it.uiip.airport.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.facades.data.TicketData;
import it.uiip.airport.core.model.RouteModel;
import it.uiip.airport.facades.data.RouteData;
import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.facades.data.PassengerData;
public class TicketPopulator implements Populator <TicketModel,TicketData>{
	
	private Converter<RouteModel,RouteData>routeConverter;
	private Converter<PassengerModel,PassengerData>passengerConverter;

	@Override
	public void populate(TicketModel source, TicketData target) throws ConversionException {
		target.setCodeTicket(source.getCodeTicket());
		target.setRoute(routeConverter.convert(source.getRoute()));
		target.setPassenger(passengerConverter.convert(source.getPassenger()));
		target.setIdSit(source.getIdSit());
		target.setPrice(source.getPrice());	
	}

}
