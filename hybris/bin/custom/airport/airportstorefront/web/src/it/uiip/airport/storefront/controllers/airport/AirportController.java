/**
 *
 */
package it.uiip.airport.storefront.controllers.airport;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uiip.airport.facades.AirportFacade;
import it.uiip.airport.facades.FlightFacade;
import it.uiip.airport.facades.PassengerFacade;
import it.uiip.airport.facades.RouteFacade;
import it.uiip.airport.facades.TicketFacade;
import it.uiip.airport.facades.data.AirportData;
import it.uiip.airport.facades.data.FlightData;
import it.uiip.airport.facades.data.PassengerData;
import it.uiip.airport.facades.data.RouteData;
import it.uiip.airport.facades.data.TicketData;
import it.uiip.airport.storefront.controllers.ControllerConstants;

@Controller
@RequestMapping(value = "/airport")
public class AirportController extends AbstractPageController
{
	@Resource(name = "airportFacade")
	private AirportFacade airportFacade;
	@Resource(name ="routeFacade")
	private RouteFacade routeFacade;
	@Resource(name = "flightFacade")
	private FlightFacade flightFacade;
	@Resource(name = "passengerFacade")
	private PassengerFacade passengerFacade;
	@Resource(name = "ticketFacade")
	private TicketFacade ticketFacade;
	

	private static final Logger LOG = Logger.getLogger(AirportController.class);



	@RequestMapping(value = "/search/{city}", method = RequestMethod.GET)
	public String searchAirportByCity(@PathVariable("city")
	final String city, final Model model, final HttpServletResponse response)
	{
		final List<AirportData> airports = airportFacade.getAirportsforCity(city);
		if (airports == null)
		{
			LOG.info("Lists of Airport null");
		}

		model.addAttribute("airports", airports);
		return ControllerConstants.Views.Pages.Airport.AirportSearchPage;

	}
	
	
	@RequestMapping(value = "/searchflight/{codeFlight}", method = RequestMethod.GET)
	public String searchFlightById(@PathVariable("codeFlight")
	final String codeFlight, final Model model, final HttpServletResponse response)
	{
		LOG.info("Search flight by code in controller airport");
		final FlightData flight = flightFacade.getFlightForId(codeFlight);
		if (flight == null)
		{
			LOG.info("Lists of Flights is null");
		}

		final RouteData route = routeFacade.getRouteForFlight(codeFlight);

		final List<TicketData> tickets = ticketFacade.getTicketsForRoute(route.getCodeRoute());

		final HashMap<TicketData, PassengerData> ticketPassengers = new HashMap<TicketData,PassengerData>(); 
		for(TicketData td : tickets) {
			ticketPassengers.put(td,passengerFacade.getPassengerForId(td.getPassenger().getUid()));
		}

		model.addAttribute("flight", flight);
		model.addAttribute("dateDeparture", route.getDateRouteDep());
		model.addAttribute("dateArrival", route.getDateRouteArr());
		model.addAttribute("ticketPassengers", ticketPassengers);
		return ControllerConstants.Views.Pages.Airport.FlightSearchPage;

	}

}
	



