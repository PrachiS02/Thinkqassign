package com.assignment2;

public class Capitalletterofeachword 
{
    public static String capitaleachword(String s)
    {
    	char ch[]=s.toLowerCase().toCharArray();
    	boolean status=false;
    	for(int i=0;i<ch.length;i++)
    	{
    		if(Character.isLetter(ch[i]))
    		{
    			if(!status)
    			{
    				ch[i]=Character.toUpperCase(ch[i]);
    			}
    			status=true;
    			
    			
    		}
    		else
    		{
    			status=false;
    		}
    	}
		return s;
    }
	public static void main(String[] args) {

          String s="java program";
          //System.out.println(s);
         capitaleachword(s);
          
	}

}
