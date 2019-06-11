package it.sopra.uiip;

public class Prodotto {
	private String codiceProdotto;
	private String descrizione;
	private double costo;
	private int punti;
	public Prodotto(String codiceProdotto, String descrizione, double costo, int punti) {
		this.codiceProdotto = codiceProdotto;
		this.descrizione = descrizione;
		this.costo = costo;
		this.punti = punti;
	}
	public String getCodiceProdotto() {
		return codiceProdotto;
	}
	public void setCodiceProdotto(String codiceProdotto) {
		this.codiceProdotto = codiceProdotto;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public int getPunti() {
		return punti;
	}
	public void setPunti(int punti) {
		this.punti = punti;
	}
	@Override
	public String toString() {
		return "Prodotto [codiceProdotto=" + codiceProdotto + ", descrizione=" + descrizione + ", costo=" + costo
				+ ", punti=" + punti + "]";
	}
	

}
