package it.sopra.uiip.morante.viaggi.model;

public class BigliettoModel {

	private int id, idvolo;
	private String passeggero, giorno;
	private double prezzo;
	
	public BigliettoModel(int id, String passeggero, int idvolo, String giorno, double prezzo) {
		this.id = id;
		this.passeggero = passeggero;
		this.idvolo = idvolo;
		this.giorno = giorno;
		this.prezzo = prezzo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdvolo() {
		return idvolo;
	}

	public void setIdvolo(int idvolo) {
		this.idvolo = idvolo;
	}

	public String getPasseggero() {
		return passeggero;
	}

	public void setPasseggero(String passeggero) {
		this.passeggero = passeggero;
	}

	public String getGiorno() {
		return giorno;
	}

	public void setGiorno(String giorno) {
		this.giorno = giorno;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "BigliettoModel [id=" + id + ", idvolo=" + idvolo + ", passeggero=" + passeggero + ", giorno=" + giorno
				+ ", prezzo=" + prezzo + "]";
	}

}
