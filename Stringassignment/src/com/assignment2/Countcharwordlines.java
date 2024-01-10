package com.assignment2;

public class Countcharwordlines
{
     public static void count(String s)
     {
    	 String st[]=s.split("\n");
    	 System.out.println("Lines:"+st.length);
    	 
    	 String st1[]=s.split(" ");
    	 System.out.println("Words:"+st.length);
    	 System.out.println("Chracters:"+s.length());
    	 
    	 
    	 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String sr=("java program\n java batch");
         count(sr);
	}

}
