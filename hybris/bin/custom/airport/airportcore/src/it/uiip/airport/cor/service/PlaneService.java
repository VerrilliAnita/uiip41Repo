package it.uiip.airport.cor.service;

import java.util.List;

import it.uiip.airport.core.model.PlaneModel;

public interface PlaneService {
	public List<PlaneModel> getPlanesForArrivalCity(String city);

}
