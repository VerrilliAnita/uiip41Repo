package it.sopra.uiip.Nisco.Viaggi.model;

import java.sql.Date;

public class PersonaModel {
		private String codiceFiscale;
		private String nome,cognome;
		private String datadinascita;
		
		public PersonaModel(String codiceFiscale, String nome, String cognome, String datadinascita) {
			this.codiceFiscale = codiceFiscale;
			this.nome = nome;
			this.cognome = cognome;
			this.datadinascita = datadinascita;
		}

		public String getCodiceFiscale() {
			return codiceFiscale;
		}

		public void setCodiceFiscale(String codiceFiscale) {
			this.codiceFiscale = codiceFiscale;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCognome() {
			return cognome;
		}

		public void setCognome(String cognome) {
			this.cognome = cognome;
		}

		public String getDatadinascita() {
			return datadinascita;
		}

		public void setDatadinascita(String datadinascita) {
			this.datadinascita = datadinascita;
		}

		@Override
		public String toString() {
			return "Persona [codiceFiscale=" + codiceFiscale + ", nome=" + nome + ", cognome=" + cognome
					+ ", datadinascita=" + datadinascita + "]";
		}
		
		
		
}
