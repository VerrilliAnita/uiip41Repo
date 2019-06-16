package it.sopra.uiip.ristaino.model;

public class PrenotazioneModel {
	
	private int idPrenotazione;
	private PasseggeroModel passeggero;
	private VoloModel volo;
	private float prezzo;
	
	public PrenotazioneModel(int idPrenotazione, PasseggeroModel passeggero, VoloModel volo, float prezzo) {
		this.idPrenotazione = idPrenotazione;
		this.passeggero = passeggero;
		this.volo = volo;
		this.prezzo = prezzo;
	}

	public int getIdPrenotazione() {
		return idPrenotazione;
	}

	public void setIdPrenotazione(int idPrenotazione) {
		this.idPrenotazione = idPrenotazione;
	}

	public PasseggeroModel getPasseggero() {
		return passeggero;
	}

	public void setPasseggero(PasseggeroModel passeggero) {
		this.passeggero = passeggero;
	}

	public VoloModel getVolo() {
		return volo;
	}

	public void setVolo(VoloModel volo) {
		this.volo = volo;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "PrenotazioneModel [idPrenotazione=" + idPrenotazione + ", passeggero=" + passeggero + ", volo=" + volo
				+ ", prezzo=" + prezzo + "]";
	}
	
	
	

}
