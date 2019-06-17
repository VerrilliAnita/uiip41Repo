package it.sopra.uiip.Homework4Goncha.model;

public class Prenotazione {
	private String codicePrenotazione;
	private String codiceFiscale;
	private int idCompagnia;
	private int idVolo;
	public Prenotazione(String codicePrenotazione, String codiceFiscale, int idCompagnia, int idVolo) {
		super();
		this.codicePrenotazione = codicePrenotazione;
		this.codiceFiscale = codiceFiscale;
		this.idCompagnia = idCompagnia;
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
	public int getIdCompagnia() {
		return idCompagnia;
	}
	public void setIdCompagnia(int idCompagnia) {
		this.idCompagnia = idCompagnia;
	}
	public int getIdVolo() {
		return idVolo;
	}
	public void setIdVolo(int idVolo) {
		this.idVolo = idVolo;
	}
	@Override
	public String toString() {
		return "Prenotazione [codicePrenotazione=" + codicePrenotazione + ", codiceFiscale=" + codiceFiscale
				+ ", idCompagnia=" + idCompagnia + ", idVolo=" + idVolo + "]";
	}

}
