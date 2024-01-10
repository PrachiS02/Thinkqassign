package com.statics;

class Cake
{
   int price;
   String cflavour;
   static int count;
   static int amt;
   
   
   {
	   count++;
   }
   
   Cake()
   {
	   
   }
   Cake(String cflavour,int price)
   {
	   this.cflavour=cflavour;
	   this.price=price;
   }
    public int getPrice()
    {
	 return price;
     }
     public void setPrice(int price) 
     {
	  this.price = price;
     }
    public String getCflavour() 
    {
	return cflavour;
    }
    public void setCflavour(String cflavour) 
    {
	this.cflavour = cflavour;
    }
	
	public String toString() {
		return "Cake [price=" + price + ", cflavour=" + cflavour + "]";
	} 
} 
public class Bakery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Cake c1=new Cake("butterscotch",500);
            Cake c2=new Cake("chocolate",600);
            Cake c3=new Cake("pineapple",450);
            
            System.out.println("types of cakes:"+c1.count);
            
	}

}
