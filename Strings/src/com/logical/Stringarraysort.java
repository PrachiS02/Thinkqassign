package com.logical;

import java.util.Arrays;

public class Stringarraysort 
{
    //sort array on the basis of length
	// of length is same then lexo
	
   public static void stringsort(String s[])
   {
	   for(int i=0;i<s.length;i++)
	   {
		   for(int j=i+1;j<s.length;j++)
		   {
			   if(s[i].length()==s[j].length())
			   {
				  if(s[i].compareTo(s[j])>0)
				  {
					  String temp=s[i];
					  s[i]=s[j];
					  s[j]=temp;
				  }
			   }
			   else if(s[i].length()>s[j].length())
			   {
				   String temp=s[i];
				   s[i]=s[j];
				   s[j]=temp;
			   }
		   }
	   }
   }

	public static void main(String[] args) {
		String s[]= {"Java","c","Angular","Devops","Python","Kotlin"};
        System.out.println(Arrays.toString(s));
        stringsort(s);
        System.out.println(Arrays.toString(s));
	}

}
