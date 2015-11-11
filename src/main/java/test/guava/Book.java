package test.guava;

import com.google.common.base.Objects;
import com.google.common.collect.ComparisonChain;

public class Book implements Comparable<Book> {
	private String title;
	private String publisher;
	private String isbn;
	private double price;
	
	
	
	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getPublisher() {
		return publisher;
	}



	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}



	public String getIsbn() {
		return isbn;
	}



	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return Objects.toStringHelper(this)
		.omitNullValues()
		.add("title", title)
		.add("publisher", publisher)
		.add("price",price)
		.add("isbn", isbn).toString();
		}



	public int compareTo(Book o) {
		return ComparisonChain.start()
		.compare(this.title, o.getTitle())
		.compare(this.publisher, o.getPublisher())
		.compare(this.isbn, o.getIsbn())
		.compare(this.price, o.getPrice())
		.result();
	}
	
	public static void main(String[] args) {
		Book book = new Book();
		book.title = "bbb";
		Book book1 = new Book();
		book1.title = "aaa";
		Book book2 = new Book();
		book2.title = "ddd";
		System.out.println(book.compareTo(book1) + ", " + book.compareTo(book2));
	}



}
