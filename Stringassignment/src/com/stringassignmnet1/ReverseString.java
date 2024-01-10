package com.stringassignmnet1;

public class ReverseString 
{
   public static String reverseString(String s)
   {
	   int len=s.length();
	   int i;
	   String s1="";
	   for( i=len-1;i>=0;i--)
	   {
		   s1=s1+s.charAt(i);
	   }
	return s1;
   }
   
   public static void stringreverse(String s)
	{
		s=s+" ";
		int len=s.length();
		int i;
		String s1="";
		char ch1=' ',ch2;
		for( i=0;i<len;i++)
		{
			ch2=s.charAt(i);
			if(ch1!=ch2)
			{
				s1=s1+ch2;
			}
			else
			{
				System.out.print(reverseString(s1)+" ");
				s1="";
			}
		}
	}

	public static void main(String[] args) {
		
         String s="Hello world";
         //System.out.println(reverseString(s));
         stringreverse(s);
	}

}
