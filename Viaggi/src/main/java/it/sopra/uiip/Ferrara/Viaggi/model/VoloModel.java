package it.sopra.uiip.Ferrara.Viaggi.model;

public class VoloModel {
	private int idVolo;
	private String giornoSett;
	private int aeroportoPart;
	private int aeroportoArr;
	private String tipoAereo;
	private int oraPartenza;
	private int oraArrivo;
	public VoloModel(int idVolo, String giornoSett, int aeroportoPart, int aeroportoArr, String tipoAereo, int oraPartenza, int oraArrivo) {
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
	
	public int getAeroportoPart() {
		return aeroportoPart;
	}
	
	public int getAeroportoArr() {
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
	
	public void setAeroportoPart(int aeroportoPart) {
		this.aeroportoPart = aeroportoPart;
	}
	
	public void setAeroportoArr(int aeroportoArr) {
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
		return "VoloModel [idVolo=" + idVolo + ", giornoSett=" + giornoSett + ", aeroportoPart=" + aeroportoPart
				+ ", aeroportoArr=" + aeroportoArr + ", tipoAereo=" + tipoAereo + ", oraPartenza=" + oraPartenza
				+ ", oraArrivo=" + oraArrivo + "]";
	}	

}
