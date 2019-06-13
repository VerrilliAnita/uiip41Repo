package it.sopra.uiip.Gonchar.BookShop.model;

public class BookModel {
	
	private int id;
	private String authore;
	private String title;
	private double price;
	private int qty;
	public BookModel(int id, String authore, String title, double price, int qty) {
		super();
		this.id = id;
		this.authore = authore;
		this.title = title;
		this.price = price;
		this.qty = qty;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthore() {
		return authore;
	}
	public void setAuthore(String authore) {
		this.authore = authore;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "BookModel [id=" + id + ", authore=" + authore + ", title=" + title + ", price=" + price + ", qty=" + qty
				+ "]";
	}
	
	


}
