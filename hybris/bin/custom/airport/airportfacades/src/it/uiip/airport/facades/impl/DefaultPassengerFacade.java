package it.uiip.airport.facades.impl;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.service.PassengerService;
import it.uiip.airport.facades.PassengerFacade;
import it.uiip.airport.facades.data.PassengerData;

public class DefaultPassengerFacade implements PassengerFacade {
	
	private static final Logger LOG = Logger.getLogger(DefaultPassengerFacade.class);
	
	private PassengerService passengerService;
	private Converter <PassengerModel,PassengerData>passengerConverter;

	@Override
	public List<PassengerData> getPassengersForDate(Date date) {
		return passengerConverter.convertAll(passengerService.getPassengersForDate(date));
	}

	public PassengerService getPassengerService() {
		return passengerService;
	}

	@Required
	public void setPassengerService(PassengerService passengerService) {
		this.passengerService = passengerService;
	}

	public Converter<PassengerModel, PassengerData> getPassengerConverter() {
		return passengerConverter;
	}
	@Required
	public void setPassengerConverter(Converter<PassengerModel, PassengerData> passengerConverter) {
		this.passengerConverter = passengerConverter;
	}

	@Override
	public List<PassengerData> getPassengersForRoute(String codeRoute) {
		LOG.info("call method --> getPassengersForRoute(String codeRoute) in DefaultPassengerFacade");
		return passengerConverter.convertAll(passengerService.getPassengersForRoute(codeRoute));
	}

	@Override
	public PassengerData getPassengerForId(String uid) {
		LOG.info("call method --> getPassengerForId(String uid) in DefaultPassengerFacade");
		return passengerConverter.convert(passengerService.getPassengerForId(uid));
	}

}
