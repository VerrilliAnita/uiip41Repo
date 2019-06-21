package it.uiip.airport.storefront.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import de.hybris.platform.acceleratorstorefrontcommons.constants.WebConstants;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.util.GlobalMessages;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import it.uiip.airport.facades.AirportFacade;
import it.uiip.airport.facades.data.AirportData;

@Controller
@RequestMapping("/airport")
public class AirportController extends AbstractPageController {
	
	private static final Logger LOG = Logger.getLogger(AirportController.class);
	
	@Resource(name="airportFacade")
	private AirportFacade airportFacade;
	
	@RequestMapping(value="/airportsCity/{city}", method = RequestMethod.GET)
	public String searchAirportForCity(@PathVariable("city") final String city, Model model)
	{
		LOG.info("controller search airports by city");
		List<AirportData> airports = airportFacade.getAirportsForCity(city);
		model.addAttribute("airports", airports);
		LOG.info("controller search airports by city call jsp SearchAirports");
		return ControllerConstants.Views.Pages.Airport.SearchAirports;
	}
	
	@RequestMapping(value="/airportsCity", method = RequestMethod.GET)
	public String searchAirport(Model model)
	{
		LOG.info("controller search airports by city");
		LOG.info("controller search airports by city call jsp SearchAirports");
		return ControllerConstants.Views.Pages.Airport.SearchAirports;
	}

}
