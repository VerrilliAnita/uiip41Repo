package it.sopra.uiip.Ferrara.Viaggi.model;

public class AeroportoModel {
	private int id;
	private String citta;
	private String nazione;
	private int npiste;
	
	public AeroportoModel(int id, String citta, String nazione, int npiste) {
		this.id = id;
		this.citta = citta;
		this.nazione = nazione;
		this.npiste = npiste;
	}

	public int getId() {
		return id;
	}

	public String getCitta() {
		return citta;
	}

	public String getNazione() {
		return nazione;
	}

	public int getNpiste() {
		return npiste;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public void setNazione(String nazione) {
		this.nazione = nazione;
	}

	public void setNpiste(int npiste) {
		this.npiste = npiste;
	}

	@Override
	public String toString() {
		return "AeroportoModel [id=" + id + ", citta=" + citta + ", nazione=" + nazione + ", npiste=" + npiste + "]";
	}

}
