package com.stringassignmnet1;

public class Removefirstlastchar 
{
     public static String removefirstlastchar(String s)
     {
    	  s=s.substring(1,s.length()-1);
    	  return s;
    			 
     }
	public static void main(String[] args) {
		
      String s="Prachi";
      System.out.println(removefirstlastchar(s));
	}

}
