package it.sopra.uiip;

import java.util.Date;

public class Persona {
	private String nome;
	private String cognome;
	private Date dataDiNascita;
	private Indirizzo indirizzo;
	
	public Persona(String nome, String cognome, Indirizzo indirizzo) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = new Date();
		this.indirizzo = indirizzo;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public Date getDataDiNascita() {
		return dataDiNascita;
	}

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setDataDiNascita(Date dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", dataDiNascita=" + dataDiNascita + ", indirizzo="
				+ indirizzo + "]";
	}

}
