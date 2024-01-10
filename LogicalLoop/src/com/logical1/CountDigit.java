package com.logical1;

public class CountDigit 
{
    public static int countdig(int num)
    {
    	int count=0;
    	do
    	{
    		count++;
    		num/=10;
    	}while(num!=0);
    	
    	return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n=123;
          System.out.println("number of digits : "+countdig(n));
	}

}
