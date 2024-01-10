package com.stringassignmnet1;

import java.util.Arrays;

public class Removefirstoccurword 
{
    public static void firstremoveword(String st,String word)
    {
    	String[] s=st.split("\\s");
    
    	for(int i=0;i<s.length;i++)
    	{
    		if(s[i].equals(word))
    		{
    		  s[i]=" ";
    		  break;
    		}
    		  		
    	}
    	System.out.println(Arrays.toString(s));
    	
    	
    }
	public static void main(String[] args) {
	String st="love light love";
	String word="love";
	firstremoveword(st, word);

	}

}
