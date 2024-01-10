package com.setdemo;

import java.util.TreeSet;

public class BookTreeSet {

	public static void main(String[] args) {

       TreeSet<Book> ts=new TreeSet<>(new PriceComparator());
       ts.add(new Book(11,"hamlet",900));
       ts.add(new Book(22,"life",300));
       ts.add(new Book(33,"secret",450));
       ts.add(new Book(44,"success",200));
       
       for(Book b:ts)
       {
    	   System.out.println(b);
       }
       
       
       
	}

}
