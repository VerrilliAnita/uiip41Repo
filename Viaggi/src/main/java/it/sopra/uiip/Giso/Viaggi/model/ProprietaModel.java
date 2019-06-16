package it.sopra.uiip.Giso.Viaggi.model;

public class ProprietaModel {
	
	private String compagnia,aereo;

	public ProprietaModel(String compagnia, String aereo) {
		this.compagnia = compagnia;
		this.aereo = aereo;
	}

	public String getCompagnia() {
		return compagnia;
	}

	public void setCompagnia(String compagnia) {
		this.compagnia = compagnia;
	}

	public String getAereo() {
		return aereo;
	}

	public void setAereo(String aereo) {
		this.aereo = aereo;
	}

	@Override
	public String toString() {
		return "ProprietaModel [compagnia=" + compagnia + ", aereo=" + aereo + "]";
	}
	
	

}
