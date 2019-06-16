package it.sopra.uiip.morante.viaggi.model;

public class VoloModel {
	
	private int id;
	//private enum giorno {Lunedi, Martedi, Mercoledi, Giovedi, Venerdi, Sabato, Domenica}
	private String giorno;
	private int aereoportoPart;
	private int aereoportoArr;
	private String aereo;
	private int oraPart;
	private int oraArr;
	
	public VoloModel(int id, String giorno, int aereoportoPart, int aereoportoArr, String aereo, int oraPart, int oraArr) {
		this.id = id;
		this.giorno = giorno;
		this.aereoportoPart = aereoportoPart;
		this.aereoportoArr = aereoportoArr;
		this.aereo = aereo;
		this.oraPart = oraPart;
		this.oraArr = oraArr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAereoportoPart() {
		return aereoportoPart;
	}

	public void setAereoportoPart(int aereoportoPart) {
		this.aereoportoPart = aereoportoPart;
	}

	public int getAereoportoArr() {
		return aereoportoArr;
	}

	public void setAereoportoArr(int aereoportoArr) {
		this.aereoportoArr = aereoportoArr;
	}

	public String getAereo() {
		return aereo;
	}

	public void setAereo(String aereo) {
		this.aereo = aereo;
	}

	public int getOraPart() {
		return oraPart;
	}

	public void setOraPart(int oraPart) {
		this.oraPart = oraPart;
	}

	public int getOraArr() {
		return oraArr;
	}

	public void setOraArr(int oraArr) {
		this.oraArr = oraArr;
	}

	public String getGiorno() {
		return giorno;
	}

	public void setGiorno(String giorno) {
		this.giorno = giorno;
	}

	@Override
	public String toString() {
		return "Volo [id=" + id + ", giorno=" + giorno + ", aereoportoPart=" + aereoportoPart + ", aereoportoArr="
				+ aereoportoArr + ", aereo=" + aereo + ", oraPart=" + oraPart + ", oraArr=" + oraArr + "]";
	}
	
	
	
}
