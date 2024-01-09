package com.oopslab;

import java.util.Scanner;

public class ArmstrongNum
{
   public static int cntdig(int n)
   {
	   int cnt = 0;
	   do
	   {
	       cnt++; 
		  n/=10;
	   }while(n!=0);
	   return cnt ;
   }   
	   public static double calPower(int b,int p)
	   {
		   double result=1;
		   for(int i=1;i<=p;i++)
		   {
			   result*=b;
		   }  
		   return result;
	   
   }
	  public static void checkArmstrong(int n)
	  {
		  int orgno=n;
		  double sum=0;
		  int noofdig=cntdig(n);
		  do
		  {
			  int rem=n%10;
			  sum=sum+calPower(rem,noofdig);
			  n/=10;
		  }while(n!=0);
		  
		 if(orgno==sum)
			  System.out.println(orgno+" is armstromg number");
		  else
			  System.out.println(orgno+" is not armstromg number");
	  }
	   
	      
	public static void main(String[] args)
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("enter the number : ");
		int n=sc.nextInt();
		checkArmstrong(n);
		
	}

}
