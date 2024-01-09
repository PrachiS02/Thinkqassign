package com.monthevaluation;

import java.util.Scanner;

public class Armstrong
{
  public static  int countdig(int n)
  {
	  int count=0;
	  do
	  {
		  count++;
		  n/=10;
	  }while(n!=0);
	return count;
  }
  public static int calpower(int b,int p)
  {
	  int res=1;
	  for(int i=1;i<=p;i++)
	  {
		  res*=b;
	  }
	  return res;
  }
  public static void checkarmstrong(int n)
  {
	  int org=n;
	  int sum=0;
	  int noofdig=countdig( n);
	  do
	  {
		  int rem=n%10;
		  sum=sum+calpower(rem,noofdig);
		  n/=10;
	  }while(n!=0);
	  
	  if(org==sum)
		  System.out.println(org+" is armstrong number");
	  else
		  System.out.println(org+" is not armstrong number");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner (System.in);
         System.out.println("Enter the number:");
         int n=sc.nextInt();
         checkarmstrong(n);
	}

}
