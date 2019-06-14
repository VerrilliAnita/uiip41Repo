package it.sopra.uiip.Minichiello.Viaggi.model;

public class VoloModel {
	private int idVolo;
	private String giornoSett;
	private AeroportoModel aeroportoPart;
	private AeroportoModel aeroportoArr;
	private AereoModel tipoaereo;
	private int oraPartenza;
	private int oraArrivo;
	public VoloModel(int idVolo, String giornoSett, AeroportoModel aeroportoPart, AeroportoModel aeroportoArr,
			AereoModel tipoaereo, int oraPartenza, int oraArrivo) {
		super();
		this.idVolo = idVolo;
		this.giornoSett = giornoSett;
		this.aeroportoPart = aeroportoPart;
		this.aeroportoArr = aeroportoArr;
		this.tipoaereo = tipoaereo;
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
	public AereoModel getTipoaereo() {
		return tipoaereo;
	}
	public void setTipoaereo(AereoModel tipoaereo) {
		this.tipoaereo = tipoaereo;
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
				+ ", aeroportoArr=" + aeroportoArr + ", tipoaereo=" + tipoaereo + ", oraPartenza=" + oraPartenza
				+ ", oraArrivo=" + oraArrivo + "]";
	}
	
}	



