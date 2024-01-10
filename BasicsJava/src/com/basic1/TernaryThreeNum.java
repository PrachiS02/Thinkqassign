package com.basic1;

import java.util.Scanner;

public class TernaryThreeNum {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		 
		int num1,num2,num3;
		System.out.println("enter three numbers : ");
		 num1=sc.nextInt();
		 num2=sc.nextInt();
		 num3=sc.nextInt();
		 
		 int res=(num1>num2?((num1>num3?num1:num3)):(num2>num2?num2:num3));
		  
		 System.out.println(res);
		 
		 
		 
	}
	

}
