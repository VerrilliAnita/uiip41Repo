package it.sopra.uiip.Minichiello.HomeWork4.model;

public class ViaggiatoreModel {
	private String cd;
	private String nome;
	private String cognome;
	public ViaggiatoreModel(String cd, String nome, String cognome) {
		super();
		this.cd = cd;
		this.nome = nome;
		this.cognome = cognome;
	}
	public String getCd() {
		return cd;
	}
	public void setCd(String cd) {
		this.cd = cd;
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
		return "Viaggiatore [cd=" + cd + ", nome=" + nome + ", cognome=" + cognome + "]";
	}
	
	
}
