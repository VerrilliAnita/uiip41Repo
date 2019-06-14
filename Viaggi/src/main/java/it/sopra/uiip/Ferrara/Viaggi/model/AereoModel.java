package it.sopra.uiip.Ferrara.Viaggi.model;

public class AereoModel {
	private String tipoAereo;
	private int nPass;
	private String quantitaMerci;
	
	public AereoModel(String tipoAereo, int nPass, String quantitaMerci) {
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

	public String getQuantitaMerci() {
		return quantitaMerci;
	}

	@Override
	public String toString() {
		return "AereoModel [tipoAereo=" + tipoAereo + ", nPass=" + nPass + ", quantitaMerci=" + quantitaMerci + "]";
	}

}
