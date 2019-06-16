package it.sopra.uiip.Nisco.Viaggi.model;

public class PrenotazioneModel {
			private int idPrenotazione;
			private PersonaModel passeggero;
			private VoloModel volo;
			
			
			public PrenotazioneModel(int idPrenotazione, PersonaModel passeggero, VoloModel volo) {
				this.idPrenotazione = idPrenotazione;
				this.passeggero = passeggero;
				this.volo = volo;
			}


			public int getIdPrenotazione() {
				return idPrenotazione;
			}


			public void setIdPrenotazione(int idPrenotazione) {
				this.idPrenotazione = idPrenotazione;
			}


			public PersonaModel getPasseggero() {
				return passeggero;
			}


			public void setPasseggero(PersonaModel passeggero) {
				this.passeggero = passeggero;
			}


			public VoloModel getVolo() {
				return volo;
			}


			public void setVolo(VoloModel volo) {
				this.volo = volo;
			}


			@Override
			public String toString() {
				return "PrenotazioneModel [idPrenotazione=" + idPrenotazione + ", passeggero=" + passeggero + ", volo="
						+ volo + "]";
			}
			
			
			
			
}
