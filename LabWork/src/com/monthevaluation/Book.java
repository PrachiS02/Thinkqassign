package com.monthevaluation;
class Book
{
	private int bookid;
	private String bookname;
	private int bookprice;
	private Author author;
	
	Book()
	{
		
	}

	public Book(int bookid, String bookname, int bookprice, Author author) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookprice = bookprice;
		this.author = author;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public int getBookprice() {
		return bookprice;
	}

	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author string) {
		this.author = string;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", bookprice=" + bookprice + ", author=" + author
				+ "]";
	}
    
	
}

