package com.basic1;

public class PostPre {

	public static void main(String[] args)
	{
		int a=10;
		int b=10;
		int c=10;
		int x= a++ + a++ + ++c -b++;
		System.out.println(" x value : "+x);
		
		int y= ++a + --b + b-- - c++ + ++a;
		System.out.println(" y value : "+y);
		
		int z= b-- + --c + c++ + c++ + ++a;
		System.out.println(" z value : "+z);

	}

}
