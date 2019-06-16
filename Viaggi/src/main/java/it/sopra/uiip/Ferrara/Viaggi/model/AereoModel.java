package it.sopra.uiip.Ferrara.Viaggi.model;

public class AereoModel {
	private String tipoAereo;
	private int nPass;
	private int quantitaMerci;
	
	public AereoModel(String tipoAereo, int nPass, int quantitaMerci) {
		this.tipoAereo = tipoAereo;
		this.nPass = nPass;
		this.quantitaMerci = quantitaMerci;
	}

	public String getTipoAereo() {
		return tipoAereo;
	}

	public int getnPass() {
		return nPass;
	}

	public int getQuantitaMerci() {
		return quantitaMerci;
	}

	public void setTipoAereo(String tipoAereo) {
		this.tipoAereo = tipoAereo;
	}

	public void setnPass(int nPass) {
		this.nPass = nPass;
	}

	public void setQuantitaMerci(int quantitaMerci) {
		this.quantitaMerci = quantitaMerci;
	}

	@Override
	public String toString() {
		return "AereoModel [tipoAereo=" + tipoAereo + ", nPass=" + nPass + ", quantitaMerci=" + quantitaMerci + "]";
	}

}
