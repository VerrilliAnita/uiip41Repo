package it.sopra.uiip.Ferrara.Viaggi.model;

public class VoloModel {
	private int idVolo;
	private String giornoSett;
	private String aeroportoPart;
	private String aeroportoArr;
	private String tipoAereo;
	private int oraPartenza;
	private int oraArrivo;
	
	public VoloModel(int idVolo, String giornoSett, String aeroportoPart, String aeroportoArr, String tipoAereo,int oraPartenza, int oraArrivo) {
		this.idVolo = idVolo;
		this.giornoSett = giornoSett;
		this.aeroportoPart = aeroportoPart;
		this.aeroportoArr = aeroportoArr;
		this.tipoAereo = tipoAereo;
		this.oraPartenza = oraPartenza;
		this.oraArrivo = oraArrivo;
	}
	public int getIdVolo() {
		return idVolo;
	}
	public String getGiornoSett() {
		return giornoSett;
	}
	public String getAeroportoPart() {
		return aeroportoPart;
	}
	public String getAeroportoArr() {
		return aeroportoArr;
	}
	public String getTipoAereo() {
		return tipoAereo;
	}
	public int getOraPartenza() {
		return oraPartenza;
	}
	public int getOraArrivo() {
		return oraArrivo;
	}
	public void setIdVolo(int idVolo) {
		this.idVolo = idVolo;
	}
	public void setGiornoSett(String giornoSett) {
		this.giornoSett = giornoSett;
	}
	public void setAeroportoPart(String aeroportoPart) {
		this.aeroportoPart = aeroportoPart;
	}
	public void setAeroportoArr(String aeroportoArr) {
		this.aeroportoArr = aeroportoArr;
	}
	public void setTipoAereo(String tipoAereo) {
		this.tipoAereo = tipoAereo;
	}
	public void setOraPartenza(int oraPartenza) {
		this.oraPartenza = oraPartenza;
	}
	public void setOraArrivo(int oraArrivo) {
		this.oraArrivo = oraArrivo;
	}
	@Override
	public String toString() {
		return "Volo [idVolo=" + idVolo + ", giornoSett=" + giornoSett + ", aeroportoPart=" + aeroportoPart
				+ ", aeroportoArr=" + aeroportoArr + ", tipoAereo=" + tipoAereo + ", oraPartenza=" + oraPartenza
				+ ", oraArrivo=" + oraArrivo + "]";
	}
	
}
