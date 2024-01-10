//25.Write a Java program to find last occurrence of a character in a given string.
package com.stringassignmnet1;

public class Findlastoccuchar 
{
    public static void lastoccur(String s,char ch)
    {
    	char ch1[]=s.toCharArray();
    	int loc = 0;
    	for(int i=0;i<ch1.length;i++) 
    	{
    		if(ch1.equals(ch1))
    		{
    			loc=i;
    		}
    	}
    	System.out.println(ch+" is last occurence character at "+loc);
    }
	public static void main(String[] args) {
	    String s="javaa";
	    char ch='a';
	    lastoccur(s,ch);
	
	}

}
