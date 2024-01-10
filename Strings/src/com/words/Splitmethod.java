package com.words;

import java.util.Arrays;

public class Splitmethod {

	public static void main(String[] args)
	{
		
         String s1="I love to learn java";
         //String st[]=s1.split("\\s");
         String st[]=s1.split(" ");
         
         System.out.println(Arrays.toString(st));
         
         String s2="I love java. I study in thinkquotient";
         
         String s[]=s2.split("\\.");
         System.out.println(Arrays.toString(s));
         
	}

}
