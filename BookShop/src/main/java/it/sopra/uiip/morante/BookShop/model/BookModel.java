package it.sopra.uiip.morante.BookShop.model;

public class BookModel {
	
	private int id, qty;
	private String title, author;
	private double price;
	
	public BookModel(int id, String title, String author, double price, int qty) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookModel [id=" + id + ", qty=" + qty + ", title=" + title + ", author=" + author + ", price=" + price
				+ "]";
	}

}
