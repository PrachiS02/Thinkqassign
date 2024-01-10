package com.ifelse;

import java.util.Scanner;

public class BillAmount {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int unit=sc.nextInt();
		double billamount;
		if(unit<=50)
			 billamount=unit*2;
		else if(unit<=80)
		    	 billamount=(50*2)+(unit-50)*3;
		      else if(unit<=100)
		        	billamount=(50*2)+(30*3)+(unit-80)*4;
		      else
		    	  billamount=(50*2)+(30*3)+(20*4)+(unit-100)*7;
		billamount=billamount+100;
		
		System.out.println("total bill : "+billamount);
	}

}
