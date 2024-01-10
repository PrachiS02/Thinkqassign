package com.assignment2;

public class CountNumberInString 
{
    public static void Countnum(String s)
    {
    	char ch[]=s.toCharArray();
    	int count=0;
        for(int i=0;i<ch.length;i++)
        {
        	if(Character.isDigit(ch[i]))
        	{
        		count++;
        		
        	}
        }
        System.out.println("Number of digits in String:"+count);
    	
    	
    }
	public static void main(String[] args) 
	{
	
       String s="abc123344";
       Countnum(s);
	}

}
