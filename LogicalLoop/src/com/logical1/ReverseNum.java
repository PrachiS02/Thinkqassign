package com.logical1;

public class ReverseNum 
{
    public static int findreverse(int num)
    {
    	int revnum=0;
    	do
    	{
    		int rem=num%10;
    		revnum=(revnum*10)+rem;
    		num=num/10;
    	}while(num!=0);
    	
    	return revnum;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=1023;
        System.out.println("reverse number " + n + " is :"+findreverse(n));
	}

}
