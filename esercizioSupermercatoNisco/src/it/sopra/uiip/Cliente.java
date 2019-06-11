package it.sopra.uiip;

public class Cliente {
		private String codiceCartaFidelity;
		private String nome,cognome;
		private int punti;
		
		public Cliente(String codiceCartaFidelity, String nome, String cognome, int punti) {
			this.codiceCartaFidelity = codiceCartaFidelity;
			this.nome = nome;
			this.cognome = cognome;
			this.punti = punti;
		}

		public String getCodiceCartaFidelity() {
			return codiceCartaFidelity;
		}

		public void setCodiceCartaFidelity(String codiceCartaFidelity) {
			this.codiceCartaFidelity = codiceCartaFidelity;
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

		public int getPunti() {
			return punti;
		}

		public void setPunti(int punti) {
			this.punti = punti;
		}

		@Override
		public String toString() {
			return "Cliente [codiceCartaFidelity=" + codiceCartaFidelity + ", nome=" + nome + ", cognome=" + cognome
					+ ", punti=" + punti + "]";
		}
		
		
		
}
