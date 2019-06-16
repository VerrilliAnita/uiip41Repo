package it.sopra.uiip.ristaino.model;

public class AereoModel {
	
	private String tipoAereo;
	private int nPass;
	private int quantitaMerci;
	private CompagniaModel compagnia;
	
	public AereoModel(String tipoAereo, int nPass, int quantitaMerci, CompagniaModel compagnia) {
		super();
		this.tipoAereo = tipoAereo;
		this.nPass = nPass;
		this.quantitaMerci = quantitaMerci;
		this.compagnia = compagnia;
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

	public CompagniaModel getCompagnia() {
		return compagnia;
	}

	public void setCompagnia(CompagniaModel compagnia) {
		this.compagnia = compagnia;
	}

	@Override
	public String toString() {
		return "AereoModel [tipoAereo=" + tipoAereo + ", nPass=" + nPass + ", quantitaMerci=" + quantitaMerci
				+ ", compagnia=" + compagnia + "]";
	}

	
	
	
	

}
