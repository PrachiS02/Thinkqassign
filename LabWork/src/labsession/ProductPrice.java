package labsession;

import java.util.Scanner;

public class ProductPrice {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int price;
		System.out.println("enter the quantity : ");
		int qty=sc.nextInt();
		
		if(qty>0)
		{
			if(qty>=50)
			{
				price=qty*100;
				System.out.println("total cost : "+price);
			}
			else if(qty>30 && qty<50)
			{
			    price=qty*125;
			    System.out.println("total cost : "+price);
			}
			else if(qty<=30)
			{
			    price=qty*140;
			    System.out.println("total cost : "+price);
			}
		}
		else
		    System.out.println("quantity is invalid");
		sc.close();
		
		

	}

}
