package fr.mds.exo2Project.book;

import fr.mds.exo2Project.author.Author;

public class Book {
	private Author author;
	private String name;
	private double price;
	private int qtyInStock;

	public Book(Author author, String name, double price, int qtyInStock ) {
		// TODO Auto-generated method stub
		this.author = author;
		this.name = name;
		this.price = price;
		this.qtyInStock = qtyInStock;
		
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	public Author getAuthor() {
		return author;
	}

	public String getName() {
		return name;
	}
	

}
