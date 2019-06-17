package it.sopra.uiip.Homework4Goncha.model;

public class Volo {
	private int idVolo;
	private String giornoSett;
	private int aeroportoPart;
	private int aeroportoArri;
	private int oraPartenz;
	private int oraArrivo;
	public Volo(int idVolo, String giornoSett, int aeroportoPart, int aeroportoArri, int oraPartenz, int oraArrivo) {
		super();
		this.idVolo = idVolo;
		this.giornoSett = giornoSett;
		this.aeroportoPart = aeroportoPart;
		this.aeroportoArri = aeroportoArri;
		this.oraPartenz = oraPartenz;
		this.oraArrivo = oraArrivo;
	}
	public int getId() {
		return idVolo;
	}
	public void setId(int id) {
		this.idVolo = id;
	}
	public String getGiornoSett() {
		return giornoSett;
	}
	public void setGiornoSett(String giornoSett) {
		this.giornoSett = giornoSett;
	}
	public int getAeroportoPart() {
		return aeroportoPart;
	}
	public void setAeroportoPart(int aeroportoPart) {
		this.aeroportoPart = aeroportoPart;
	}
	public int getAeroportoArri() {
		return aeroportoArri;
	}
	public void setAeroportoArri(int aeroportoArri) {
		this.aeroportoArri = aeroportoArri;
	}
	public int getOraPartenz() {
		return oraPartenz;
	}
	public void setOraPartenz(int oraPartenz) {
		this.oraPartenz = oraPartenz;
	}
	public int getOraArrivo() {
		return oraArrivo;
	}
	public void setOraArrivo(int oraArrivo) {
		this.oraArrivo = oraArrivo;
	}
	@Override
	public String toString() {
		return "Volo [id=" + idVolo + ", giornoSett=" + giornoSett + ", aeroportoPart=" + aeroportoPart + ", aeroportoArri="
				+ aeroportoArri + ", oraPartenz=" + oraPartenz + ", oraArrivo=" + oraArrivo + "]";
	}
	

}

