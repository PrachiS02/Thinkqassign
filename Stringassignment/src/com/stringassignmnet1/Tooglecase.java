package com.stringassignmnet1;

public class Tooglecase 
{
    static void toogglecase(String s1)
   {
	   String s2="";
	   for(int i=0;i<s1.length();i++)
	   {
		   if(Character.isUpperCase(s1.charAt(i)))
		   {
			   s2=s2+Character.toLowerCase(s1.charAt(i));
		   }
		   else
		   {
			   s2=s2+Character.toUpperCase(s1.charAt(i));
		   }
	   }
	   System.out.println("Toggle string :"+s2);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s1="jaVaProGram";
         System.out.println("Input string:"+s1);
         toogglecase(s1);
         
	}

}
