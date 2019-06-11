package it.sopra.uiip;

import java.util.ArrayList;

public class Studente extends Persona {
	
	private int livelloLaurea;
	private String titoloStudio;
	private ArrayList<String> corsiDiFormazione;
	
	public Studente(String nome, String cognome, Indirizzo indirizzo, int livelloLaurea, String titoloStudio) {
		super(nome, cognome, indirizzo);
		this.livelloLaurea=livelloLaurea;
		this.titoloStudio=titoloStudio;
		this.corsiDiFormazione = new ArrayList<String>();
	}

	public int getLivelloLaurea() {
		return livelloLaurea;
	}

	public void setLivelloLaurea(int livelloLaurea) {
		this.livelloLaurea = livelloLaurea;
	}

	public String getTitoloStudio() {
		return titoloStudio;
	}

	public void setTitoloStudio(String titoloStudio) {
		this.titoloStudio = titoloStudio;
	}

	public ArrayList<String> getCorsiDiFormazione() {
		return corsiDiFormazione;
	}

	public void setCorsiDiFormazione(ArrayList<String> corsiDiFormazione) {
		this.corsiDiFormazione = corsiDiFormazione;
	}

	@Override
	public String toString() {
		return "Studente [livelloLaurea=" + livelloLaurea + ", titoloStudio=" + titoloStudio + ", corsiDiFormazione="
				+ corsiDiFormazione + "]";
	}
	

}
