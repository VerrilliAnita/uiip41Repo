package it.sopra.uiip.ristaino.model;

public class CompagniaModel {
	
	private String nome;
	private String nazioneSede;
	
	public CompagniaModel(String nome, String nazioneSede) {
		this.nome = nome;
		this.nazioneSede = nazioneSede;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNazioneSede() {
		return nazioneSede;
	}

	public void setNazioneSede(String nazioneSede) {
		this.nazioneSede = nazioneSede;
	}

	@Override
	public String toString() {
		return "CompagniaModel [nome=" + nome + ", nazioneSede=" + nazioneSede + "]";
	}
	
	

}
