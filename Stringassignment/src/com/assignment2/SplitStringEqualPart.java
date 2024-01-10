package com.assignment2;

import java.util.Arrays;

public class SplitStringEqualPart
{
	public static void divideString(String s,int noOfC)
	{
		int len=s.length();
		
		
		if(len%noOfC!=0)
		{
			System.out.println("Cannot divide in equal parts........");
		}
		else
		{
			int n=len/noOfC;
			String splstr[]=new String[n];
			
			int index=0;
			for(int i=0;i<s.length();i+=noOfC)
			{
				splstr[index]=s.substring(i,i+noOfC);
				index++;
			}
			System.out.println(Arrays.toString(splstr));
		}
	}
	
	public static void main(String[] args) {
		
		String st[]= {"i","am","very","smart"};
		String str=String.join("",st);
		
		int noOfChar=4;
		divideString(str, noOfChar);
	}


}
