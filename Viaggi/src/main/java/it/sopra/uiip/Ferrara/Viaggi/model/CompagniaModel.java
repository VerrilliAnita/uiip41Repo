package it.sopra.uiip.Ferrara.Viaggi.model;

public class CompagniaModel {
	private String nome;
	private String nazione;
	
	public CompagniaModel(String nome, String nazione) {
		this.nome = nome;
		this.nazione = nazione;
	}

	public String getNome() {
		return nome;
	}

	public String getNazione() {
		return nazione;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNazione(String nazione) {
		this.nazione = nazione;
	}

	@Override
	public String toString() {
		return "CompagniaModel [nome=" + nome + ", nazione=" + nazione + "]";
	}

}
