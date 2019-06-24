/**
 *
 */
package it.uiip.airport.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import it.uiip.airport.core.model.FlightModel;
import it.uiip.airport.core.model.RouteModel;
import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.facades.data.FlightData;
import it.uiip.airport.facades.data.RouteData;
import it.uiip.airport.facades.data.TicketData;

import org.springframework.beans.factory.annotation.Required;






/**
 * @author soprasteria
 *
 */
public class RoutePlanePopulator implements Populator<RouteModel, RouteData>
{
	


	private Converter<FlightModel, FlightData> flightConverter;
	private Converter<TicketModel, TicketData> ticketPlaneConverter;
	
	@Override
	public void populate(final RouteModel source, final RouteData target) throws ConversionException
	{
		target.setCodeRoute(source.getCodeRoute());
		target.setFlight(flightConverter.convert(source.getFlight()));
		target.setDataRouteDep(source.getDataRouteDep());
		target.setDataRouteArr(source.getDataRouteArr());
		target.setTickets(ticketPlaneConverter.convertAll(source.getTicket()));

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
	
	public Converter<TicketModel, TicketData> getTicketPlaneConverter() {
		return ticketPlaneConverter;
	}
	
	@Required
	public void setTicketPlaneConverter(Converter<TicketModel, TicketData> ticketPlaneConverter) {
		this.ticketPlaneConverter = ticketPlaneConverter;
	}

}
