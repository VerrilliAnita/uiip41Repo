/**
 *
 */
package it.uiip.airport.storefront.controllers.airport;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uiip.airport.facades.AirportFacade;
import it.uiip.airport.facades.AirportRouteFacade;
import it.uiip.airport.facades.AirportTicketFacade;
import it.uiip.airport.facades.data.AirportData;
import it.uiip.airport.facades.data.AirportRouteData;
import it.uiip.airport.storefront.controllers.ControllerConstants;

@Controller
@RequestMapping(value = "/airport")
public class AirportController extends AbstractPageController
{
	@Resource(name = "airportFacade")
	private AirportFacade airportFacade;
	@Resource(name = "airportTicketFacade")
	private AirportTicketFacade ticketFacade;
	@Resource(name = "airportRouteFacade")
	private AirportRouteFacade routeFacade;

	String AirportPath = "pages/airport/viewInfoPath";


	private static final Logger LOG = Logger.getLogger(AirportController.class);

	@RequestMapping(value = "/infoPath/{cityDep}/{cityArr}", method = RequestMethod.GET)

	public String viewInfoFlight(@PathVariable
	final String cityDep, @PathVariable
	final String cityArr, final String codeRoute, final Model model, final HttpServletResponse response)
	{
		final Map<String, List<AirportRouteData>> routes = routeFacade.getRouteAirportAToAirportB(cityDep, cityArr, new Date());
		if (routes == null)
		{
			LOG.info("Lists of routes null");
		}

		model.addAttribute("pathRoute", routes);

		return ControllerConstants.Views.Pages.Airport.AirportPath;

	}

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



	@RequestMapping(value = "/infoFlight/{codeRoute}", method = RequestMethod.GET)

	public String viewInfoFlight(@PathVariable("codeRoute")

	final String codeRoute, final Model model, final HttpServletResponse response)
	{
		final List<AirportRouteData> routes = routeFacade.getRoutesForCode(codeRoute);
		if (routes == null)
		{
			LOG.info("Lists of routes null");
		}
		model.addAttribute("route", routes.get(0));
		return ControllerConstants.Views.Pages.Airport.AirportInfoPage;

	}

}
