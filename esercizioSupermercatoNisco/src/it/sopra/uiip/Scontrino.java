package it.sopra.uiip;

import java.util.ArrayList;

public class Scontrino {
	
	private String codice;
	private Cliente cliente;
	private ArrayList<Prodotto> listaProdotti;
	private double importo;
	
	public Scontrino(String codice, Cliente cliente, ArrayList<Prodotto> listaProdotti) {
		super();
		this.codice = codice;
		this.cliente = cliente;
		this.listaProdotti = listaProdotti;
		this.importo = Supermercato.calcolaImporto(listaProdotti);
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Prodotto> getListaProdotti() {
		return listaProdotti;
	}

	public void setListaProdotti(ArrayList<Prodotto> listaProdotti) {
		this.listaProdotti = listaProdotti;
	}
	
	public double getImporto() {
		return importo;
	}

	public void setImporto(double importo) {
		this.importo = importo;
	}

	@Override
	public String toString() {
		return "Scontrino [codice=" + codice + ", cliente=" + cliente + "]";
	}
	
	

}
