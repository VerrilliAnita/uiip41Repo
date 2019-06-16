package it.sopra.uiip.morante.viaggi.model;

public class CompagniaModel {
	
	private int id;
	private String nome, nazione;
	
	public CompagniaModel(int id, String nome, String nazione) {
		this.id = id;
		this.nome = nome;
		this.nazione = nazione;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "CompagniaModel [id=" + id + ", nome=" + nome + ", nazione=" + nazione + "]";
	}
	
}
