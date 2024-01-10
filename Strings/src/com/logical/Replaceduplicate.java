package com.logical;

import java.util.Scanner;

public class Replaceduplicate 
{
    public static String replacedup(String st)
    {
    	char ch[]=st.toCharArray();
    	for(int i=0;i<ch.length;i++)
    	{
    		for(int j=i+1;j<ch.length;j++)
    		{
    			if(ch[i]==ch[j])
    			{
    				//st=st.replace(st.charAt(j), '#');
    			   ch[j]='#';
    			}
    		}
    	}
    	st=new String(ch);
		return st;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word:");
		String s=sc.next();
		
		System.out.println("original word:"+s);
		System.out.println("New:"+replacedup(s));
	
	}

}
