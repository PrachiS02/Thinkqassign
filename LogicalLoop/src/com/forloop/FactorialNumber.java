package com.forloop;

public class FactorialNumber {
	
	public static long calculateFact(int num)
	{
		long fact1=1;
		for(int i=1;i<=num;i++)
		{
			fact1=fact1*i;
			System.out.println(fact1);
		}
		
		System.out.println("----------------------");
		long fact=1;
		for(int i=num;i>1;i--)
		{
			fact=fact*i;
			System.out.println(fact);
		}
		
		return fact;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        calculateFact(5);
	}

}
