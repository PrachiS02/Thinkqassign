package com.stringassignmnet1;

import java.util.Scanner;

public class Deletelastfirstchar 
{
    
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		String s;
		char delch;
		
		System.out.println("enter the string :");
		s=sc.nextLine();
		
		System.out.println("enter the character to delete:");
		delch=sc.next().charAt(0);
		
    	char[] ch=s.toCharArray();
    	int len=s.length();
    	for(int i=len-1;i>=0;i--)
    	{
    		if(ch[i]==delch)
    		{
    			ch[i]=0;
    			break;
    		}
    	}
    	System.out.println("after delete the character " +delch+ " charcater: ");
    	System.out.println(ch);
    	

	}

}
