package com.stringassignmnet1;

public class Removeblankspace {
	
     public static void removeblankspace(String s)
     {
    	 s=s.replaceAll("\\s+", "");
    	 System.out.println(s);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="  India  is   my   country";
       removeblankspace(s);
	}

}
