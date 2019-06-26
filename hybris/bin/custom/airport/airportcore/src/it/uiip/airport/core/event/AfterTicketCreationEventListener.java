package it.uiip.airport.core.event;


import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import it.uiip.airport.core.model.RouteModel;

public class AfterTicketCreationEventListener extends AbstractEventListener<AfterTicketCreationEvent>{

	

	@Override
	protected void onEvent(AfterTicketCreationEvent event) 
	{
		RouteModel route =event.getRoute();
		
		
		
	}

}
