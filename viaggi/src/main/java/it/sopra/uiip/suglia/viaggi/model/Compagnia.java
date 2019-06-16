package it.sopra.uiip.suglia.viaggi.model;

public class Compagnia {
	
	private int idComp;
	private String nomeCompagnia;
	private String tipoAereo;
	
	public Compagnia(int idComp, String nomeCompagnia, String tipoAereo) {
		this.idComp = idComp;
		this.nomeCompagnia = nomeCompagnia;
		this.tipoAereo = tipoAereo;
	}

	public int getIdComp() {
		return idComp;
	}

	public void setIdComp(int idComp) {
		this.idComp = idComp;
	}

	public String getNomeCompagnia() {
		return nomeCompagnia;
	}

	public void setNomeCompagnia(String nomeCompagnia) {
		this.nomeCompagnia = nomeCompagnia;
	}

	public String getTipoAereo() {
		return tipoAereo;
	}

	public void setTipoAereo(String tipoAereo) {
		this.tipoAereo = tipoAereo;
	}

	@Override
	public String toString() {
		return "Compagnia [idComp=" + idComp + ", nomeCompagnia=" + nomeCompagnia + ", tipoAereo=" + tipoAereo + "]";
	}
	
	
}
