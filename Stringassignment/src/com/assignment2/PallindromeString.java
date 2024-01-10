package com.assignment2;

public class PallindromeString
{
	static void reversestring(String st)
    {
   	 String rev="";
   	 for(int i=st.length()-1;i>=0;i--)
   	 {
   		 rev=rev+st.charAt(i);
   	 }
   	  System.out.println("reverse string :"+rev);
   	 
   	 if(st.equals(rev))
   	 {
   		 System.out.println("String is pallindrome");
   	 }
   	 else
   	 {
   		 System.out.println("String is not pallindrome");
   	 }
   	 
    }
	
	
	public static void main(String[] args) 
	{
        String s="raja";
        System.out.println("original string :"+s);
      
        reversestring(s);
        
	}

}
