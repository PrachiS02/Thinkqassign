package com.lab;

public class Namepattern 
{
    public static void pattern(String s)
    {
    
          int sp1=s.indexOf(' ');
          int sp2=s.lastIndexOf(' ');
          
           System.out.println(s.charAt(0)+"."+s.charAt(sp1+1)+"."+s.charAt(sp2+1)+".");
         
          System.out.println(s.charAt(0)+"."+s.charAt(sp1+1)+"."+s.substring(sp2+1,s.length()));
    	 
          System.out.println(s.substring(sp2+1,s.length())+" "+s.substring(0,sp1)+" "+s.substring(sp1+1,sp2));
    	
          System.out.println("------------------------------------------------------------");
          
          
          
          
          
          
          
        //other logic
   		System.out.println(s.substring(0,1)+"."+s.subSequence(7,8)+"."+s.subSequence(14,15)+".");
   		System.out.println(s.substring(0,1)+"."+s.subSequence(7,8)+"."+s.substring(14));
    	System.out.println(s.substring(14)+" "+s.substring(0,6)+" "+s.substring(7, 13)+" ");
    		
    	
    }
	public static void main(String[] args) {
		
        String s="Sachin Ramesh Tendulkar";
        pattern(s);
	}

}
