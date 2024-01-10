package com.words;

import java.util.Arrays;

public class DivideStringequal {

	static void dividestring(String s,int noofc)
	{
		int len=s.length();
		if(len%noofc!=0  )
		{
			
			System.out.println("can not divide in equal parts");
			
		}
		else
		{
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
	}
	public static void main(String[] args) {
		
          String a[]= {"I","am","very","smart"};
          String s=String.join("", a);
         // System.out.println(s);
          int noofc=4;
          dividestring(s, noofc);
	}

}
