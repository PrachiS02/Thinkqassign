package com.logical1;

public class FindSum 
{
	public static int sumcal(int num)
    {
    	int sum=0;
    	do
    	{
    		sum+=(num%10);
    		num/=10;
    	}while(num!=0);
    	
    	return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int n=789;
            System.out.println("sum of digits : "+sumcal(n));
	}

}
