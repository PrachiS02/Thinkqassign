package com.dao;

import com.pojo.Book;

public class BookDaoImpl implements BookDao 
{
	Book bookarr[];
	int i;
	int index;
	public BookDaoImpl() {
		bookarr=new Book[10];
		index=0;
	}
	@Override
	public void addBook(Book book) {
		
		bookarr[index]=book;
		index++;
	}

	@Override
	public void updateBook(Book book) {
		
		
	}

	@Override
	public void deleteBook(int bookid) {
		
		
	}

	@Override
	public void showAllBook() {
		
//		for(Book b:bookarr) {
//			System.out.println(b);
//		}
		
			for(int i=0;i<index;i++) {
				System.out.println(bookarr[i]);
			}
		
		
	}

	@Override
	public Book searchbookbyid(int bookid) {

		Book b=null;
		for(int i=0;i<index;i++) {
			if(bookarr[i].getBookid()==bookid) {
				b=bookarr[i];
				
				break;
			}
		}
		return b;
		
	}
	
}
