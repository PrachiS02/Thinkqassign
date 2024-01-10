package com.logical1;

public class ExtractDigit
{
    public static void finddigit(int num)
    {
    	do
    	{
    		//int rem=num%10;
    		//System.out.println(rem);
    		System.out.println(num%10);
    		num/=10;
    	}while(num!=0);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=1234;
         finddigit(n);
	}

}
