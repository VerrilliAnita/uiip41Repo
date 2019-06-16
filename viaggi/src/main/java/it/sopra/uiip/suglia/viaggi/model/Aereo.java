package it.sopra.uiip.suglia.viaggi.model;


public class Aereo {
	private String tipoAereo;
	private int nPass;
	private int quantitaMerci;
	
	public Aereo(String tipoAereo, int nPass, int quantitaMerci) {
		this.tipoAereo = tipoAereo;
		this.nPass = nPass;
		this.quantitaMerci = quantitaMerci;
	}

	public String getTipoAereo() {
		return tipoAereo;
	}

	public void setTipoAereo(String tipoAereo) {
		this.tipoAereo = tipoAereo;
	}

	public int getnPass() {
		return nPass;
	}

	public void setnPass(int nPass) {
		this.nPass = nPass;
	}

	public int getQuantitaMerci() {
		return quantitaMerci;
	}

	public void setQuantitaMerci(int quantitaMerci) {
		this.quantitaMerci = quantitaMerci;
	}

	@Override
	public String toString() {
		return "Aereo [tipoAereo=" + tipoAereo + ", nPass=" + nPass + ", quantitaMerci=" + quantitaMerci + "]";
	}
}
