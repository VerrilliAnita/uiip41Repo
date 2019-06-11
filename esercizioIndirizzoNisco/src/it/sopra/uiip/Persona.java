package it.sopra.uiip;

import java.util.Date;

public class Persona {
	
	private String nome, cognome;
	private Date dataNascita;
	private Indirizzo indirizzo;
	
	public Persona(String nome, String cognome, Date dataNascita, Indirizzo indirizzo) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.indirizzo = indirizzo;
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

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", dataNascita=" + dataNascita + ", indirizzo="
				+ indirizzo + "]";
	}
	
	

}
