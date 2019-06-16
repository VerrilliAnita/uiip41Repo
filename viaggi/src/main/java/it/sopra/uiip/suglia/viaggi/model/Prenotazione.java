package it.sopra.uiip.suglia.viaggi.model;

public class Prenotazione {
	
	private String codicePrenotazione;
	private String codiceFiscale;
	private int idVolo;
	
	public Prenotazione(String codicePrenotazione, String codiceFiscale, int idVolo) {
		this.codicePrenotazione = codicePrenotazione;
		this.codiceFiscale = codiceFiscale;
		this.idVolo = idVolo;
	}

	public String getCodicePrenotazione() {
		return codicePrenotazione;
	}

	public void setCodicePrenotazione(String codicePrenotazione) {
		this.codicePrenotazione = codicePrenotazione;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public int getIdVolo() {
		return idVolo;
	}

	public void setIdVolo(int idVolo) {
		this.idVolo = idVolo;
	}

	@Override
	public String toString() {
		return "Prenotazione [codicePrenotazione=" + codicePrenotazione 
				+ ", codiceFiscale=" + codiceFiscale
				+ ", idVolo=" + idVolo + "]";
	}
	
	
}
