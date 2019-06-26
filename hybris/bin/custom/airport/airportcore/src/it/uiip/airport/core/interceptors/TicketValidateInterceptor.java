package it.uiip.airport.core.interceptors;

import org.apache.log4j.Logger;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import it.uiip.airport.core.model.FlightModel;
import it.uiip.airport.core.model.PlaneModel;
import it.uiip.airport.core.model.RouteModel;
import it.uiip.airport.core.model.TicketModel;

public class TicketValidateInterceptor implements ValidateInterceptor {
	
	private static final Logger LOG = Logger.getLogger(TicketValidateInterceptor.class);
	
	
	@Override
	public void onValidate(Object model, InterceptorContext ctx) throws InterceptorException {
		
		LOG.info("Call interceptor method --> onValidate() in TicketCreateInterceptor");
		
		if(model instanceof TicketModel && model != null) {
			TicketModel ticket = (TicketModel) model;
			RouteModel routeModel = ticket.getRoute();
			if(routeModel == null) throw new InterceptorException("Route is null");
			if(routeModel.getTickets() == null) throw new InterceptorException("List of tickets is null");
			FlightModel flightModel = routeModel.getFlight();
			if(flightModel == null) throw new InterceptorException("Flight of route is null");
			PlaneModel planeModel = flightModel.getPlane();
			if(planeModel == null) throw new InterceptorException("Plane is null");
			
			int tickets = routeModel.getTickets().size();
			int numOfSits = planeModel.getNumOfSits();
			LOG.info("tickets: " +tickets);
			LOG.info("num of sits: " +numOfSits);
			if(tickets > numOfSits) {
				LOG.error("Tickets is more of num of sits");
				throw new InterceptorException("Number of sits sold out...");
			}
			else {
				LOG.info("Save the ticket");
			}
		}
		
	}

}
