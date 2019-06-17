package it.sopra.uiip.Homework4Goncha.model;

public class Aeroporto {
	private int id;
	private String citta;
	private String nazione;
	private String npiste;
	public Aeroporto(int id, String citta, String nazione, String npiste) {
		super();
		this.id = id;
		this.citta = citta;
		this.nazione = nazione;
		this.npiste = npiste;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public String getNazione() {
		return nazione;
	}
	public void setNazione(String nazione) {
		this.nazione = nazione;
	}
	public String getNpiste() {
		return npiste;
	}
	public void setNpiste(String npiste) {
		this.npiste = npiste;
	}
	@Override
	public String toString() {
		return "Aeroporto [id=" + id + ", citta=" + citta + ", nazione=" + nazione + ", npiste=" + npiste + "]";
	}

}
