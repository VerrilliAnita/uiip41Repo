/**
 *
 */
package it.uiip.airport.storefront.controllers.airport;



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
import it.uiip.airport.facades.AirportTicketFacade;
import it.uiip.airport.facades.FlightRouteFacade;
import it.uiip.airport.facades.data.AirportData;
import it.uiip.airport.facades.data.AirportTicketData;
import it.uiip.airport.storefront.controllers.ControllerConstants;

@Controller
@RequestMapping(value = "/airport")
public class AirportController extends AbstractPageController
{
	@Resource(name = "airportFacade")
	private AirportFacade airportFacade;
	@Resource(name = "airportTicketFacade")
	private AirportTicketFacade airportTicketFacade;
	@Resource (name = "flightRouteFacade")
	private FlightRouteFacade flightRouteFacade;

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
		
	@RequestMapping(value = "/viewFlight/{codeFlight}", method = RequestMethod.GET)
	public String viewflight(@PathVariable("codeFlight")
	final String codeFlight, final Model model, final HttpServletResponse response) {
			final List<AirportTicketData> tickets = airportTicketFacade.getTicketsForCodeFlight(codeFlight);
			if (tickets == null)
			{
				LOG.info("Lists of Tickets null");
			}
			model.addAttribute("tickets", tickets);
			return ControllerConstants.Views.Pages.Airport.AirportInfoPage;

	}
	
	@RequestMapping(value = "/infoRoute/{codeFlight}", method = RequestMethod.GET)
	public String infoRoute(@PathVariable("codeRoute")
	final String codeRoute, final Model model, final HttpServletResponse response) {
			final List<FlightRouteData> routes = flightRouteFacade.getRoutesForCode(codeRoute);
			if (routes == null)
			{
				LOG.info("Lists of routes null");
			}
			model.addAttribute("routes", routes);
			return ControllerConstants.Views.Pages.Airport.AirportRoutePage;

	}


}
