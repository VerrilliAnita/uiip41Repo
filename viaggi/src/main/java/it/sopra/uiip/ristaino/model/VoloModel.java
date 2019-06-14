package it.sopra.uiip.ristaino.model;

public class VoloModel {
	
	private int idVolo;
	private String giornoSett;
	private AeroportoModel aeroportoPart;
	private AeroportoModel aeroportoArr;
	private AereoModel tipoAereo;
	private int oraPartenza, oraArrivo;
	
	public VoloModel(int idVolo, String giornoSett, AeroportoModel aeroportoPart, AeroportoModel aeroportoArr,
			AereoModel tipoAereo, int oraPartenza, int oraArrivo) {
		super();
		this.idVolo = idVolo;
		this.giornoSett = giornoSett;
		this.aeroportoPart = aeroportoPart;
		this.aeroportoArr = aeroportoArr;
		this.tipoAereo = tipoAereo;
		this.oraPartenza = oraPartenza;
		this.oraArrivo = oraArrivo;
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

	public AereoModel getTipoAereo() {
		return tipoAereo;
	}

	public void setTipoAereo(AereoModel tipoAereo) {
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

	public int getIdVolo() {
		return idVolo;
	}

	@Override
	public String toString() {
		return "VoloModel [idVolo=" + idVolo + ", giornoSett=" + giornoSett + ", aeroportoPart=" + aeroportoPart
				+ ", aeroportoArr=" + aeroportoArr + ", tipoAereo=" + tipoAereo + ", oraPartenza=" + oraPartenza
				+ ", oraArrivo=" + oraArrivo + "]";
	}
	
	
	
	

}
