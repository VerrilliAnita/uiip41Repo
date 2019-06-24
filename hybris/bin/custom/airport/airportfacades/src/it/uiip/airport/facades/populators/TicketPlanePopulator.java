/**
 *
 */
package it.uiip.airport.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.model.RouteModel;
import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.facades.data.PassengerData;
import it.uiip.airport.facades.data.RouteData;
import it.uiip.airport.facades.data.TicketData;




/**
 * @author soprasteria
 *
 */
public class TicketPlanePopulator implements Populator<TicketModel, TicketData>
{
	private Converter<PassengerModel, PassengerData> passengerConverter;




	@Override
	public void populate(final TicketModel source, final TicketData target) throws ConversionException
	{
		target.setCodeTicket(source.getCodeTicket());
		target.setPassenger(passengerConverter.convert(source.getPassenger()));
		
		target.setPrice(source.getPrice());
		target.setSit(source.getSit());
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


	


}
