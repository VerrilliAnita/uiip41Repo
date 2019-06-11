package it.sopra.uiip;

public class Cliente {
	private String codiceCarteFidelity;
	private String nome;
	private String cognome;
	private int punti;
	
	public Cliente(String codiceCarteFidelity, String nome, String cognome, int punti) {
		this.codiceCarteFidelity = codiceCarteFidelity;
		this.nome = nome;
		this.cognome = cognome;
		this.punti = punti;
	}

	public String getCodiceCarteFidelity() {
		return codiceCarteFidelity;
	}

	public void setCodiceCarteFidelity(String codiceCarteFidelity) {
		this.codiceCarteFidelity = codiceCarteFidelity;
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

	public int getPunti() {
		return punti;
	}

	public void setPunti(int punti) {
		this.punti = punti;
	}

	@Override
	public String toString() {
		return "Cliente [codiceCarteFidelity=" + codiceCarteFidelity + ", nome=" + nome + ", cognome=" + cognome
				+ ", punti=" + punti + "]";
	}
	


}
