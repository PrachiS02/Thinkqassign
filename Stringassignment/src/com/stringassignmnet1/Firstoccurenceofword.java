package com.stringassignmnet1;

public class Firstoccurenceofword 
{
    public static void firstoccurword(String s,String word)
    {
    	String st[]=s.split("\\s");
    	int loc=0;
    	String s1="";
    	for(int i=st.length-1;i>=0;i--)
    	{
    		if(st[i].equalsIgnoreCase(word))
    		{
    		   loc=i;
    		}
    	}
    	System.out.println(word+" first occurance word is at "+loc);
    }
    
	public static void main(String[] args) {
		
		String str="jingle bells jingle the bells jingle on the way";
		firstoccurword(str, "the");
	}

}
