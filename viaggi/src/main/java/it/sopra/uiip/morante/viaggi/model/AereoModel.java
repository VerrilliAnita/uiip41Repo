package it.sopra.uiip.morante.viaggi.model;

public class AereoModel {
	
	private String tipo;
	private int numeroPosti, quantita;
	
	public AereoModel(String tipo, int numeroPosti, int quantita) {
		this.tipo = tipo;
		this.numeroPosti = numeroPosti;
		this.quantita = quantita;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumeroPosti() {
		return numeroPosti;
	}

	public void setNumeroPosti(int numeroPosti) {
		this.numeroPosti = numeroPosti;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	@Override
	public String toString() {
		return "Aereo [tipo=" + tipo + ", numeroPosti=" + numeroPosti + ", quantita=" + quantita + "]";
	}
	
	
	

}
