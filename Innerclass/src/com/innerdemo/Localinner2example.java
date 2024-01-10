package com.innerdemo;

class Mall
{
	private String mallname="pacific";
	private String loc="Pune";
	
	void doshopping()
	{
		
		class Cart
		{
			String item;
			double price;
			static double  bill=0;
			
			public void addItem(String item,double price)
			{
				this.item=item;
				this.price=price;
				System.out.println(this.item+":"+this.price);
				bill+=price;			
			    
			}
			
			public void displayBill()
			{
				System.out.println("--------------------");
				System.out.println("Total bill:"+bill);
				
				System.out.println("Thank you for shopping at "+mallname+":"+loc);
				
			}
		}
		Cart c1=new Cart();
		c1.addItem("Laptop",89000);
		c1.addItem("chocolates", 50);
		c1.displayBill();
	}

}
     public class Localinner2example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Mall cust1=new Mall();
          cust1.doshopping();
	}

}
