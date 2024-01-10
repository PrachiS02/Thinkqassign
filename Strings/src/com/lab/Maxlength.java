package com.lab;

public class Maxlength
{
   public static void maxlength(String s)
   {
	   String word[]=s.split(" ");
	   String maxlenword=word[0];
	   
	   for(int i=0;i<word.length;i++)
	   {
		
			   if(word[i].length()>maxlenword.length())
			   {
				   maxlenword=word[i];
				
		      }
		   
	   }
	   System.out.println(maxlenword);
	
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str=" i love java programming";
         maxlength(str);
	}

}
