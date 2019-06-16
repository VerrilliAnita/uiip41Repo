package it.sopra.uiip.Nisco.Viaggi.model;

public class VoloModel {
		private int idVolo;
		private String giornoSett;
		private AeroportoModel aeroportoPart;
		private AeroportoModel aeroportoArr;
		private CompagniaAereaModel compagnia;
		private int oraPartenza;
		private int oraArrivo;
		
		
		public VoloModel(int idVolo, String giornoSett, AeroportoModel aeroportoPart, AeroportoModel aeroportoArr,
				CompagniaAereaModel compagnia, int oraPartenza, int oraArrivo) {
			this.idVolo = idVolo;
			this.giornoSett = giornoSett;
			this.aeroportoPart = aeroportoPart;
			this.aeroportoArr = aeroportoArr;
			this.compagnia = compagnia;
			this.oraPartenza = oraPartenza;
			this.oraArrivo = oraArrivo;
		}


		public int getIdVolo() {
			return idVolo;
		}


		public void setIdVolo(int idVolo) {
			this.idVolo = idVolo;
		}


		public String getGiornoSett() {
			return giornoSett;
		}


		public void setGiornoSett(String giornoSett) {
			this.giornoSett = giornoSett;
		}


		public AeroportoModel getAeroportoPart() {
			return aeroportoPart;
		}


		public void setAeroportoPart(AeroportoModel aeroportoPart) {
			this.aeroportoPart = aeroportoPart;
		}


		public AeroportoModel getAeroportoArr() {
			return aeroportoArr;
		}


		public void setAeroportoArr(AeroportoModel aeroportoArr) {
			this.aeroportoArr = aeroportoArr;
		}
		
		public CompagniaAereaModel getCompagnia() {
			return compagnia;
		}


		public void setCompagnia(CompagniaAereaModel compagnia) {
			this.compagnia = compagnia;
		}


		public int getOraPartenza() {
			return oraPartenza;
		}


		public void setOraPartenza(int oraPartenza) {
			this.oraPartenza = oraPartenza;
		}


		public int getOraArrivo() {
			return oraArrivo;
		}


		public void setOraArrivo(int oraArrivo) {
			this.oraArrivo = oraArrivo;
		}


		@Override
		public String toString() {
			return "VoloModel [idVolo=" + idVolo + ", giornoSett=" + giornoSett + ", aeroportoPart=" + aeroportoPart
					+ ", aeroportoArr=" + aeroportoArr + ", compagnia=" + compagnia + ", oraPartenza=" + oraPartenza
					+ ", oraArrivo=" + oraArrivo + "]";
		}
		
		
		
		
		
		
		
		
		
		
		
}
