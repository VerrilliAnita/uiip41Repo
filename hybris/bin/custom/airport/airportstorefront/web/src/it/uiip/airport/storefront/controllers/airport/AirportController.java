/**
 *
 */
package it.uiip.airport.storefront.controllers.airport;


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

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import it.uiip.airport.facades.AirportFacade;
import it.uiip.airport.facades.FlightFacade;
import it.uiip.airport.facades.PassengerFacade;
import it.uiip.airport.facades.RoutePlaneFacade;
import it.uiip.airport.facades.TicketPlaneFacade;
import it.uiip.airport.facades.data.AirportData;

import it.uiip.airport.facades.data.RouteData;

import it.uiip.airport.storefront.controllers.ControllerConstants;

@Controller
@RequestMapping(value = "/airport")
public class AirportController extends AbstractPageController
{
	@Resource(name = "airportFacade")
	private AirportFacade airportFacade;
	
	@Resource(name = "flightFacade")
	private FlightFacade flightFacade;
	
	@Resource(name = "routePlaneFacade")
	private RoutePlaneFacade routePlaneFacade;
	
	@Resource(name = "passengerFacade")
	private PassengerFacade passengerFacade;
	
	@Resource(name = "ticketPlaneFacade")
	private TicketPlaneFacade ticketPlaneFacade;

	private static final Logger LOG = Logger.getLogger(AirportController.class);



	@RequestMapping(value = "/search/{city}", method = RequestMethod.GET)
	public String searchAirportByCity(@PathVariable("city")
	final String city, final Model model, final HttpServletResponse response)
	{
		LOG.info("Search airport by city in controller airport");
		final List<AirportData> airports = airportFacade.getAirportsforCity(city);
		if (airports == null)
		{
			LOG.info("Lists of Airport null");
		}

		model.addAttribute("airports", airports);
		return ControllerConstants.Views.Pages.Airport.AirportSearchPage;

	}
	
	@RequestMapping(value = "/searchFlight/{codeRoute}", method = RequestMethod.GET)
	
	public String searchFlightById(@PathVariable("codeRoute")
	final String codeRoute, final Model model, final HttpServletResponse response)
	{
		LOG.info("Search route by code in controller airport");
		
		final RouteData route = routePlaneFacade.getRouteForCodeRoute(codeRoute);
		
		
		model.addAttribute("route", route);
		
		return ControllerConstants.Views.Pages.Airport.RouteSearchPage;

	}

}
