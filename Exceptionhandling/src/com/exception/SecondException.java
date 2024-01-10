package com.exception;

public class SecondException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   
    	    String s=null;
    	    System.out.println(s.length());
    	    
    	    int a[]= {1,2,3};
    	    System.out.println(a[0]);
       }catch (Exception e)
       {
    	   System.out.println(e);
       }
       
       System.out.println("Rest of code");
	}

}
