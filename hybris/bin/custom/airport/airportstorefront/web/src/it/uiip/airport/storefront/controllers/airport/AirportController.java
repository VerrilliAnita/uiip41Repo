/**
 *
 */
package it.uiip.airport.storefront.controllers.airport;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

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
import it.uiip.airport.facades.RoutePlaneFacade;
import it.uiip.airport.facades.TicketPlaneFacade;
import it.uiip.airport.facades.data.AirportData;
import it.uiip.airport.facades.data.CabinCrewData;
import it.uiip.airport.facades.data.CrewData;
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
	/*
	@RequestMapping(value = "/searchflight/{codeFlight}", method = RequestMethod.GET)
	public String searchFlightById(@PathVariable("codeFlight")
	final String codeFlight, final Model model, final HttpServletResponse response)
	{
		LOG.info("Search flight by code in controller airport");
		final List<FlightData> flight = flightFacade.findFlightById(codeFlight);
		if (flight == null)
		{
			LOG.info("Lists of Flights is null");
		}
		
		final RouteData route = routePlaneFacade.getRouteForFlight(codeFlight);
		
		final List<TicketData> tickets = ticketPlaneFacade.getTicketsForRoute(route.getCodeRoute());
		
		final HashMap<TicketData, PassengerData> ticketPassengers = new HashMap<TicketData, PassengerData>(); 
		for(TicketData td : tickets) {
			ticketPassengers.put(td, 
					passengerFacade.getPassengerForId(td.getPassenger().getUid()));
		}
		
		//final List<PassengerData> passengers = passengerFacade.getPassengersForRoute(route.getCodeRoute());

		model.addAttribute("flight", flight.get(0));
		model.addAttribute("dateDep", route.getDateRouteDep());
		model.addAttribute("dateArr", route.getDateRouteArr());
		model.addAttribute("ticketPassengers", ticketPassengers);
		return ControllerConstants.Views.Pages.Airport.FlightSearchPage;

	}
	*/
	@RequestMapping(value = "/searchroute/{codeRoute}", method = RequestMethod.GET)
	public String searchRouteByCode(@PathVariable("codeRoute")
	final String codeRoute, final Model model, final HttpServletResponse response)
	{
		LOG.info("Search route by code in controller airport");
		
		final RouteData route = routePlaneFacade.getRouteForCode(codeRoute);
		
		final FlightData flight = route.getFlight();
		final String dateDep = route.getDateRouteDep().toString();
		final String dateArr = route.getDateRouteArr().toString();
		final ArrayList<TicketData> tickets = (ArrayList<TicketData>) route.getTickets();
		
		final HashMap<TicketData, PassengerData> ticketPassengers = new HashMap<TicketData, PassengerData>(); 
		for(TicketData td : tickets) {
			ticketPassengers.put(td, td.getPassenger());
		}
		
		model.addAttribute("flight", flight.getCodeFlight());
		model.addAttribute("dateDep", dateDep);
		model.addAttribute("dateArr", dateArr);
		model.addAttribute("ticketPassengers", ticketPassengers);
		return ControllerConstants.Views.Pages.Airport.RouteSearchPage;

	}
	
	@RequestMapping(value = "/searchroute/cabincrew/{airportDep}", method = RequestMethod.GET)
	public String searchCabinCrewByAirportDep(@PathVariable("airportDep")
	final String airportDep, final Model model, final HttpServletResponse response)
	{
		LOG.info("Search cabinCrew by airportDep in controller airport");
		
		final List<RouteData> routes = routePlaneFacade.getRoutesForAirportDep(airportDep);
		
		if(routes == null) {
			LOG.info("List of routes is null");
			
		}
		
		HashMap<String, List<CabinCrewData>> cabinCrewes = new HashMap<String, List<CabinCrewData>>();
		
		for(RouteData route : routes) {
			CrewData crew = route.getCrew();
			cabinCrewes.put(route.getCodeRoute(), crew.getCabinCrew());
		}
		
		model.addAttribute("cabinCrewes", cabinCrewes);
		return ControllerConstants.Views.Pages.Airport.CabinCrewesSearchPage;

	}
	
	@RequestMapping(value = "/searchroute/commander/{commander}/{month}", method = RequestMethod.GET)
	public String searchRoutesByCommander(@PathVariable("commander")
	final String commander, @PathVariable("month")
	final String month, final Model model, final HttpServletResponse response)
	{
		LOG.info("Search route by commander in controller airport");
		
		final List<RouteData> routes = routePlaneFacade.getRoutesForCommander(commander, month);
		
		if(routes == null) {
			LOG.info("List of routes is null");
			
		}
		
		model.addAttribute("routes", routes);
		model.addAttribute("commander", commander);
		model.addAttribute("month", month);
		return ControllerConstants.Views.Pages.Airport.RouteCommanderSearchPage;

	}
	
}
