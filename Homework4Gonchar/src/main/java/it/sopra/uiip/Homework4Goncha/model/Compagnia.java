package it.sopra.uiip.Homework4Goncha.model;

public class Compagnia {
	private int idCompagnia;
	private String nomeCompagnia;
	private String tipoAereo;
	private String volo;
	public Compagnia(int idCompagnia, String nomeCompagnia, String tipoAereo, String volo) {
		super();
		this.idCompagnia = idCompagnia;
		this.nomeCompagnia = nomeCompagnia;
		this.tipoAereo = tipoAereo;
		this.volo = volo;
	}
	public int getIdCompagnia() {
		return idCompagnia;
	}
	public void setIdCompagnia(int idCompagnia) {
		this.idCompagnia = idCompagnia;
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
	public String getVolo() {
		return volo;
	}
	public void setVolo(String volo) {
		this.volo = volo;
	}
	@Override
	public String toString() {
		return "Compagnia [idCompagnia=" + idCompagnia + ", nomeCompagnia=" + nomeCompagnia + ", tipoAereo=" + tipoAereo
				+ ", volo=" + volo + "]";
	}
	

}
