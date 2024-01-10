package com.encapsulation;

public class Library
{
     
	public static void main(String[] args)
	{
		 Book b1=new Book();
		  b1.setId(101);
		  b1.setBname("wings of fires");
		  b1.setPrice(560);
	  
		  Book b2=new Book();
		  b2.setId(102);
		  b2.setBname("Harry potter");
		  b2.setPrice(520);
		  
		  System.out.println("Book1:"+ b1.getBname()+" "+b1.getPrice());
		  System.out.println("Book2:"+ b2.getBname()+" "+b2.getPrice());
		  
		  
	}

}
