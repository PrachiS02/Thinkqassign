package com.stringassignmnet1;

public class Vowelsconsonant {

	public static void main(String[] args) 
	{
       String s1="Elephant";
       System.out.println("String s1:"+s1);
       int vcnt=0,ccnt=0;
       s1=s1.toLowerCase();
       
       for(int i=0;i<s1.length();i++)
       {
    	   if(s1.charAt(i)=='a'|| s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
    		   vcnt++;
    	   else if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
    		   ccnt++;
       }
       System.out.println("Number of vowels : "+vcnt);
       System.out.println("Number of consonant: "+ccnt);
       

	}
}