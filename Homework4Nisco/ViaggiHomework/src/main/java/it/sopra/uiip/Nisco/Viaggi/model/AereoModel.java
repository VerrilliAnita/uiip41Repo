package it.sopra.uiip.Nisco.Viaggi.model;

public class AereoModel {
		private String tipoAereo;
		private int npass;
		private int quantitamerci;
		
		public AereoModel(String tipoAereo, int npass, int quantitamerci) {
			this.tipoAereo = tipoAereo;
			this.npass = npass;
			this.quantitamerci = quantitamerci;
		}

		public String getTipoAereo() {
			return tipoAereo;
		}

		public void setTipoAereo(String tipoAereo) {
			this.tipoAereo = tipoAereo;
		}

		public int getNpass() {
			return npass;
		}

		public void setNpass(int npass) {
			this.npass = npass;
		}

		public int getQuantitamerci() {
			return quantitamerci;
		}

		public void setQuantitamerci(int quantitamerci) {
			this.quantitamerci = quantitamerci;
		}

		@Override
		public String toString() {
			return "AereoModel [tipoAereo=" + tipoAereo + ", npass=" + npass + ", quantitamerci=" + quantitamerci + "]";
		}
		
		
		

}
