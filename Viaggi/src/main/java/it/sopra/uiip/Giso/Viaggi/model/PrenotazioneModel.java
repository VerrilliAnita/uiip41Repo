package it.sopra.uiip.Giso.Viaggi.model;

public class PrenotazioneModel {
	
	private int id;
	private String codiceFiscale,nome,cognome;
	private int volo;
	
	public PrenotazioneModel(int id, String codiceFiscale, String nome, String cognome, int volo) {
		this.id = id;
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.cognome = cognome;
		this.volo = volo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getVolo() {
		return volo;
	}

	public void setVolo(int volo) {
		this.volo = volo;
	}

	@Override
	public String toString() {
		return "PrenotazioneModel [id=" + id + ", codiceFiscale=" + codiceFiscale + ", nome=" + nome + ", cognome="
				+ cognome + ", volo=" + volo + "]";
	}
	
	
	
	

}
