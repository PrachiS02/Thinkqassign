package com.methodcalling;

public class checkevenodd {
	
	public static void evenodd(int num)
	{
		if(num%2==0)
			System.out.println(num+" is even");
		else
			System.out.println(num+" is odd ");
	}
	
	public static int calsum(int num1,int num2)
	{
		int sum=num1+num2;
		return sum;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		evenodd(67);
		
		int result=calsum(34,67);
		System.out.println(result);

	}

}
