package com.encapsulation;

public class Book 
{
   private int id;
   private String bname;
   private double price;
   
   public void setId(int id)
   {
	   this.id=id;
   }
   public int getId()
   {
	   return id;
   }
   public void setBname(String bname)
   {
	   this.bname=bname;
   }
   public String getBname()
   {
	   return bname;
   }
   public void setPrice(double price)
   {
	   this.price=price;
   }
   public double getPrice()
   {
	   return price;
   }
   public String toString()
   {
	   return "{Id:"+id+" bookname: "+bname+" Price: "+price+"}";
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
