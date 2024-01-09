package com.conditional;

import java.util.Scanner;

public class AlphaDigit
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
        System.out.println("enter the character : ");
         char ch=sc.next().charAt(0);
         
         if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
         {
             System.out.println(ch+" is alphabet ");
         }
         if(ch>=48 && ch<=57)
         { 
         	 System.out.println(ch+" is Digit ");
         }	
         else
         {
        	 System.out.println(ch+" is Special Character");
         }
         sc.close();
}
}
