package it.sopra.uiip.Giso.Viaggi.model;

public class CompagniaModel {
	
	private String nome,nazione;

	public CompagniaModel(String nome, String nazione) {
		this.nome = nome;
		this.nazione = nazione;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNazione() {
		return nazione;
	}

	public void setNazione(String nazione) {
		this.nazione = nazione;
	}

	@Override
	public String toString() {
		return "CompagniaModel [nome=" + nome + ", nazione=" + nazione + "]";
	}
	
	
	

}
