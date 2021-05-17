package com.ict10.jdbc;

public class EX05_VO {
	int id = 0;
	String bookname = "";
	String publisher = "";
	int price = 0;
	public EX05_VO(int id, String bookname, String publisher, int price) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.publisher = publisher;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
