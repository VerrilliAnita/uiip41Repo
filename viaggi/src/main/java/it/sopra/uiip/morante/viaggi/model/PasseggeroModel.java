package it.sopra.uiip.morante.viaggi.model;

public class PasseggeroModel {
	
	private String codiceFiscale, nome, cognome;

	public PasseggeroModel(String codiceFiscale, String nome, String cognome) {
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	@Override
	public String toString() {
		return "PasseggeroModel [codiceFiscale=" + codiceFiscale + ", nome=" + nome + ", cognome=" + cognome + "]";
	}
	
	

}
