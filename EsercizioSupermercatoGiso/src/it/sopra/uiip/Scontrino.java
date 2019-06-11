package it.sopra.uiip;

import java.util.ArrayList;

public class Scontrino {
	private String codiceScontrino;
	private Cliente cliente;
	private ArrayList<Prodotto> prodotti;
	private double importo;
	
	public Scontrino(String codiceScontrino, Cliente cliente, ArrayList<Prodotto> prodotti, double importo) {
		super();
		this.codiceScontrino = codiceScontrino;
		this.cliente = cliente;
		this.prodotti = prodotti;
		this.importo = importo;
	}

	public String getCodiceScontrino() {
		return codiceScontrino;
	}

	public void setCodiceScontrino(String codiceScontrino) {
		this.codiceScontrino = codiceScontrino;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Prodotto> getProdotti() {
		return prodotti;
	}

	public void setProdotti(ArrayList<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}

	public double getImporto() {
		return importo;
	}

	public void setImporto(double importo) {
		this.importo = importo;
	}

	@Override
	public String toString() {
		return "Scontrino [codiceScontrino=" + codiceScontrino + ", cliente=" + cliente.getNome() + ", importo=" + importo + "]";
	}
	
	


}
