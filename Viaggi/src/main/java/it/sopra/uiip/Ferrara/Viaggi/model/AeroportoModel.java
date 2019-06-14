package it.sopra.uiip.Ferrara.Viaggi.model;

public class AeroportoModel {
	private int id;
	private String citta;
	private String nazione;
	private int nPiste;
	
	public AeroportoModel(int id, String citta, String nazione, int nPiste) {
		this.id = id;
		this.citta = citta;
		this.nazione = nazione;
		this.nPiste = nPiste;
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

	public int getnPiste() {
		return nPiste;
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

	public void setnPiste(int nPiste) {
		this.nPiste = nPiste;
	}

	@Override
	public String toString() {
		return "Aeroporto [id=" + id + ", citta=" + citta + ", nazione=" + nazione + ", nPiste=" + nPiste + "]";
	}
	
}
