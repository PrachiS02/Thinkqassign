package com.stringassignmnet1;

import java.util.Scanner;

public class Countoccurofword {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       String str,word;
       int count=0;
       System.out.println("Enter the string:");
       str=sc.nextLine();
       System.out.println("enter the word from string:");
       word=sc.next();
       
       String w[]=str.split(" ");
       
       for(int i=0;i<w.length;i++)
       {
    	   if(word.equals(w[i]))
    	   {
    		   count++;
    	   }
       }
       System.out.println("occurrence of word:"+count);
	}

}
