package com.stringassignmnet1;

public class Removefirstoccuchar
{
    public static void firstOccurcharemove(String s,char c)
    {
    	char ch[]=s.toCharArray();
    	for(int i=0;i<ch.length;i++)
    	{
    		if(ch[i]==c)
    		{
    			ch[i]=' ';
    			break;
    		}
    	}
    	System.out.println(ch);
    }
	public static void main(String[] args) 
	{
       String st="java";
       char ch='a';
       firstOccurcharemove(st, ch);


	}

}
