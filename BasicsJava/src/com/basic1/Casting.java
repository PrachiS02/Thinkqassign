package com.basic1;

public class Casting {

	public static void main(String[] args) 
	{
		char ch='C';
		int num = ch;
		System.out.println("num value is : "+num);
		
		//double to int conversion
		double d=166.66;
		int i=(int) d;
		System.out.println("value is : "+i);
		
		//int to char conversion
		int n=122;
		char ch1=(char)n;
		System.out.println("char is : "+ch1);
		
		long l=4567889;
		float f=(long)l;
		System.out.println("value is : "+f);
		
	
		

	}

}
