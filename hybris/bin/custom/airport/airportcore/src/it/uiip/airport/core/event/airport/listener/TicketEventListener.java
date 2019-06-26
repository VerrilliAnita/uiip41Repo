package it.uiip.airport.core.event.airport.listener;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import de.hybris.platform.servicelayer.config.ConfigurationService;
import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import it.uiip.airport.core.enums.StateTicket;
import it.uiip.airport.core.event.airport.TicketEvent;
import it.uiip.airport.core.interceptors.TicketPrepareInterceptor;
import it.uiip.airport.core.model.AirportModel;
import it.uiip.airport.core.model.FlightModel;
import it.uiip.airport.core.model.RouteModel;
import it.uiip.airport.core.model.TicketModel;

public class TicketEventListener extends AbstractEventListener<TicketEvent> {
	
	private static final Logger LOG = Logger.getLogger(TicketEventListener.class);
	
	private ConfigurationService configurationService;
	
	@Override
	protected void onEvent(TicketEvent ticketEvent) {
		LOG.info("Call method ---> onEvent(TicketEvent ticketEvent) in TicketEventListener class");
		
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		
		
		try {
			fileWriter = new FileWriter(configurationService.getConfiguration().getString("passengers.path"));
			bufferedWriter = new BufferedWriter(fileWriter);
			
			RouteModel route = ticketEvent.getRoute();
			
			bufferedWriter.append("Route: " +route.getCodeRoute());
			
			FlightModel flightModel = route.getFlight();
		
			if(flightModel != null) {
				AirportModel airportDepModel = flightModel.getAirportDep();
				AirportModel airportArrModel = flightModel.getAirportArr();
				if(airportDepModel != null) {
					bufferedWriter.append("		Departure airport: " 
							+airportDepModel.getName());
				}
				if(airportArrModel != null) {
					bufferedWriter.append("		Arrival airport: " 
							+airportArrModel.getName());
				}
			}
			
			bufferedWriter.newLine();
			
			Set<TicketModel> tickets = (Set<TicketModel>) route.getTickets();
			if(tickets != null) {
				for(TicketModel ticket : tickets) {
					if(ticket.getState() != null && ticket.getPassenger() != null) {
						if(!ticket.getState().equals((StateTicket.CANCELLED))) {
							bufferedWriter.append(ticket.getPassenger().getName());
							bufferedWriter.append(" --- " +ticket.getSeatNumber());
							bufferedWriter.append(" --- " +ticket.getState());
							bufferedWriter.newLine();
						}
					}
				}
			}
			
		} catch (IOException e) {
			LOG.error("Error on write file", e);
		}
		finally {
		    try {
		    	bufferedWriter.flush();
		    	bufferedWriter.close();
				fileWriter.close();
			} catch (IOException e) {
				LOG.error("Error on close file", e);
			}
		}
		
	}

	public ConfigurationService getConfigurationService() {
		return configurationService;
	}
	
	@Required
	public void setConfigurationService(ConfigurationService configurationService) {
		this.configurationService = configurationService;
	}

	
}
