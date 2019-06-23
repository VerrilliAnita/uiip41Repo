/**
 *
 */
package it.uiip.airport.storefront.controllers.airport;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;

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
import it.uiip.airport.facades.TicketFacade;
import it.uiip.airport.facades.data.AirportData;
import it.uiip.airport.facades.data.TicketData;
import it.uiip.airport.storefront.controllers.ControllerConstants;

@Controller
@RequestMapping(value = "/airport")
public class AirportController extends AbstractPageController
{
	@Resource(name = "airportFacade")
	private AirportFacade airportFacade;
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



	@RequestMapping(value = "/infoFlight/{codeFlight}", method = RequestMethod.GET)

	public String viewInfoFlight(@PathVariable("codeFlight")

	final String codeFlight, final Model model, final HttpServletResponse response)
	{
		final List<TicketData> tickets = ticketFacade.getTicketsForCodeFlight(codeFlight);
		if (tickets == null)
		{
			LOG.info("Lists of Tickets null");
		}
		model.addAttribute("codeFlight", tickets.get(0).getRoute().getFlight().getCodeFlight());
		model.addAttribute("tickets", tickets);
		return ControllerConstants.Views.Pages.Airport.AirportInfoPage;

	}

}
