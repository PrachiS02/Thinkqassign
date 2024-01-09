package com.oopslab;

import java.util.Scanner;

public class OnlinePayment 
{
    //by if-else approach
	static Scanner sc=new Scanner(System.in);
	
	public static void byIfelse()
	{
		int mode,ctype;
	    int cvv;
	    long cno;
		System.out.println("enter the payment mode \n1.cash\n2.card:");
		mode=sc.nextInt();
		
		if(mode==1)
		{
			System.out.println("Payment done by cash");
		}
		else
		{
			System.out.println("payment by card:");
			System.out.println("enter \n1.credit card  \n2.debit card");
			ctype=sc.nextInt();
			if(ctype==1)
			{
				System.out.println("credit card");
				System.out.println("enter card no:");
				cno=sc.nextLong();
				System.out.println("enter cvv no:");
				cvv=sc.nextInt();
			}
			
		}		
}
	//by switch case approach
	public static void byswitch()
	{
		int cvv,cardno;
		String mode,card;
		System.out.println("Enter mode of payment cash/card:");
		mode=sc.next();
				switch(mode)
				{
	     case "cash":
			          System.out.println("payment done by cash");
			          break;
		  case "card":
			          System.out.println("payment by card");
			          System.out.println("Enter credit/debit card:");
			          String ctype=sc.next();
			          
			          switch(ctype)
			          {
			             case "debit":
			            	         //System.out.println("Debit card");
			            	         System.out.println("enter debit card no:");
			            	         cardno=sc.nextInt();
			            	         System.out.println("enter debit cvv no:");
			        	             cvv=sc.nextInt();
			        	             break;
			        	             
			             case "credit":
								   
								    System.out.println("enter credit card no:");
								    cardno = sc.nextInt();
								    System.out.println("enter credit cvv no:");
								    cvv = sc.nextInt();
								    break;  
								    
					    default:
					    	    System.out.println("invalid payment card");
					    	    break;
		          }
				}}
	public static void main(String[] args) 
	{
		OnlinePayment op=new OnlinePayment();
		byIfelse();
		//byswitch();

	}

}
