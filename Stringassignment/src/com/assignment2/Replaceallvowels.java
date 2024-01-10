package com.assignment2;

public class Replaceallvowels 
{
	public static void replaceallvowels(String s,char spclsymbol)
    {
    	s=s.toLowerCase();
    	char ch[]=s.toCharArray();
    	
    	for(int i=0;i<s.length();i++)
    	{
    		char ch1=s.charAt(i);
    		if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
    			
    		{
    			ch[i]=spclsymbol;
    		}
    	}
    	String s1=new String(ch);
    	System.out.println("new String:"+s1);
    	
    	
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       String s="I love india";
       System.out.println("original string:"+s);
       char spclsymbol='#';
     replaceallvowels(s, spclsymbol);  
	}

}
