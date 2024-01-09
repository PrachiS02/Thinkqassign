package labsession;

import java.util.Scanner;

public class CommercialApp
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to flipkart");
		
		System.out.println(" 1.Men :");
		System.out.println(" 2.Women :");
		System.out.println(" 3.Kids:");
		
		System.out.println("enter your choice : ");
		int cat=sc.nextInt();
		
		if(cat==1)
		{	
		
		  System.out.println("thanks for selecting mens category ");
		  System.out.println("following are sub category : ");
		  System.out.println("1. footwear ");
		  System.out.println("2.T-shirt ");
		  
		  System.out.println("enter your choice :");
		  int opt=sc.nextInt();
		  
		  if(opt==1)
		  {
			  System.out.println("category : mens ");
			  System.out.println("category option : footwear");
		  }
		  else
		  {
			  System.out.println("category : mens ");
			  System.out.println("category option : T-shirt");
		  }
		}
		  else if(cat==2)
		  {
			  System.out.println("thanks for selecting womens category ");
			  System.out.println("following are sub category : ");
			  System.out.println("1.jewellery ");
			  System.out.println("2.saree "); 
		  
			  System.out.println("enter your choice :");
			  int opt=sc.nextInt();
			  

			  if(opt==1)
			  {
				  System.out.println("category : women ");
				  System.out.println("category option : jewellary");
			  }
			  else
			  {
				  System.out.println("category : women ");
				  System.out.println("category option : saree");
			  }
		  }
		  else
		  {
			  System.out.println("thanks for selecting kids category ");
			  System.out.println("following are sub category : ");
			  System.out.println("1.Toys ");
			  System.out.println("2.Educational Game "); 
	
			  System.out.println("enter your choice :");
			  int  opt=sc.nextInt();
			
			  if(opt==1)
			  {
				  System.out.println("category : kids ");
				  System.out.println("category option : Toys");
			  }
			  else
			  {
				  System.out.println("category : kids ");
				  System.out.println("category option : Educational Game");
			  }
	
		  }
	}
}		
			
		
	   

		
	


