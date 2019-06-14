package it.sopra.uiip.morante.viaggi.model;

public class AeroportoModel {
	
	private int id;
	private String citta;
	private String nazione;
	private int numeroPiste;
	
	public AeroportoModel(int id, String citta, String nazione, int numeroPiste) {
		this.id = id;
		this.citta = citta;
		this.nazione = nazione;
		this.numeroPiste = numeroPiste;
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

	public int getNumeroPiste() {
		return numeroPiste;
	}

	public void setNumeroPiste(int numeroPiste) {
		this.numeroPiste = numeroPiste;
	}

	@Override
	public String toString() {
		return "Aeroporto [id=" + id + ", citta=" + citta + ", nazione=" + nazione + ", numeroPiste=" + numeroPiste
				+ "]";
	}
	
	

}
