package it.sopra.uiip;

import java.util.ArrayList;

public class Scontrino {
	
	private String codiceScontrino;
	private Cliente cliente;
	private ArrayList<Prodotto> prodotti;
	private double importo;
	
	public Scontrino(String codiceScontrino, Cliente cliente, double importo) {
		this.codiceScontrino = codiceScontrino;
		this.cliente = cliente;
		this.importo = importo;
		this.prodotti = new ArrayList<Prodotto>();
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
	
	public void addProdotto(Prodotto p) {
		prodotti.add(p);
	}

	@Override
	public String toString() {
		return "Scontrino [codiceScontrino=" + codiceScontrino + ", cliente=" + cliente + ", prodotti=" + prodotti
				+ ", importo=" + importo + "]";
	}
	
	
	
	

}
