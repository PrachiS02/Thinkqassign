package com.loop;

import java.util.Scanner;

public class Frequency 
{
   public static void freqdig(int num)
   {
	   int freq=0;
	   do 
	   {
		   freq++;
		   num/=10;
	   }while(num!=0);
	   
	   System.out.println(freq);
	   
   }
	   
  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number : ");
		int n=sc.nextInt();
		
		freqdig(n);

	}

}
