package com.words;

import java.util.Arrays;

public class Dividestringnotequal 
{
	static void dividestring(String s,int noofc)
	{
		int len=s.length();
		if(len%noofc!=0  )
		{
			
		  int x=noofc-(len%noofc);
		  for(int i=0;i<x;i++)
		  {
			  s=s.concat("#");
		  }
			
		}
		
		len=s.length();
			int n=len/noofc;
			
			String splstr[]=new String[n];
			int index=0;
			
			for(int i=0;i<s.length();i+=noofc)
			{
				splstr[index]=s.substring(i,i+noofc);
				index++;
			}
			
			System.out.println(Arrays.toString(splstr));
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= {"I","am","very","smart"};
        String s=String.join("", a);
       // System.out.println(s);
        int noofc=5;
        dividestring(s, noofc);
	}

}
