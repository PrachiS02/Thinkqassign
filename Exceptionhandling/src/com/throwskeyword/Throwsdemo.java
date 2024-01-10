package com.throwskeyword;

import java.io.IOException;

public class Throwsdemo 

{
     static void method1() throws IOException,NullPointerException
     {
    	 String s=null;
    	 System.out.println(s.length());
    	 
    	 try
    	 {
    		 throw new IOException("No input");
    	 }
    	 catch(Exception e)
    	 {
    		 System.out.println(e);
    	 }
     }
     
     static void method2() throws IOException
     {
    	 String s=null;
    	 System.out.println(s.length());
    	 
    	
    		 throw new IOException("No input");
    	 
    	
     }
	public static void main(String[] args) throws NullPointerException, IOException {
		// TODO Auto-generated method stub
         method1();
         method2();
	}

}
