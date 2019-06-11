package it.sopra.uiip;

public class Indirizzo {
	private String via;
	private int civico;
	private String citta;
	private int cap;
	private String provinca;
	private String regione;
	public Indirizzo(String via, int civico, String citta, int cap, String provinca, String regione) {
		super();
		this.via = via;
		this.civico = civico;
		this.citta = citta;
		this.cap = cap;
		this.provinca = provinca;
		this.regione = regione;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public int getCivico() {
		return civico;
	}
	public void setCivico(int civico) {
		this.civico = civico;
	}
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public int getCap() {
		return cap;
	}
	public void setCap(int cap) {
		this.cap = cap;
	}
	public String getProvinca() {
		return provinca;
	}
	public void setProvinca(String provinca) {
		this.provinca = provinca;
	}
	public String getRegione() {
		return regione;
	}
	public void setRegione(String regione) {
		this.regione = regione;
	}
	@Override
	public String toString() {
		return "Indirizzo [via=" + via + ", civico=" + civico + ", citta=" + citta + ", cap=" + cap + ", provinca="
				+ provinca + ", regione=" + regione + "]";
	}

	
	
}
