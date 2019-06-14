package it.sopra.uiip.suglia.viaggi.model;

public class Volo {
	
	private int idVolo;
	private String giornoSettimana;
	private int aeroportoPart;
	private int aeroportoArr;
	private String tipoAereo;
	private int oraPartenza;
	private int oraArrivo;
	
	public Volo(int idVolo, String giornoSettimana, int aeroportoPart, int aeroportoArr, String tipoAereo,
			int oraPartenza, int oraArrivo) {
		this.idVolo = idVolo;
		this.giornoSettimana = giornoSettimana;
		this.aeroportoPart = aeroportoPart;
		this.aeroportoArr = aeroportoArr;
		this.tipoAereo = tipoAereo;
		this.oraPartenza = oraPartenza;
		this.oraArrivo = oraArrivo;
	}

	public int getIdVolo() {
		return idVolo;
	}

	public void setIdVolo(int idVolo) {
		this.idVolo = idVolo;
	}

	public String getGiornoSettimana() {
		return giornoSettimana;
	}

	public void setGiornoSettimana(String giornoSettimana) {
		this.giornoSettimana = giornoSettimana;
	}

	public int getAeroportoPart() {
		return aeroportoPart;
	}

	public void setAeroportoPart(int aeroportoPart) {
		this.aeroportoPart = aeroportoPart;
	}

	public int getAeroportoArr() {
		return aeroportoArr;
	}

	public void setAeroportoArr(int aeroportoArr) {
		this.aeroportoArr = aeroportoArr;
	}

	public String getTipoAereo() {
		return tipoAereo;
	}

	public void setTipoAereo(String tipoAereo) {
		this.tipoAereo = tipoAereo;
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
		return "Aeroporto [idVolo=" + idVolo + ", giornoSettimana=" + giornoSettimana + ", aeroportoPart="
				+ aeroportoPart + ", aeroportoArr=" + aeroportoArr + ", tipoAereo=" + tipoAereo + ", oraPartenza="
				+ oraPartenza + ", oraArrivo=" + oraArrivo + "]";
	}


}
