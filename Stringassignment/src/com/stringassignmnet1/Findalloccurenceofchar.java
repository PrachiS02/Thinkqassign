//15.	Write a Java program to search all occurrences of a character in given string.
package com.stringassignmnet1;

import java.util.Scanner;

public class Findalloccurenceofchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           System.out.println("enter any string:");
           String st=sc.nextLine();
           
           System.out.println("enter character:");
           char ch=sc.next().charAt(0);
           
           for(int i=0;i<st.length();i++)
           {
        	   if(st.charAt(i)==ch)
        	   {
        		   System.out.println(ch+ " fount at position:"+i+" ");
        	   }
           }
           
	}

}
