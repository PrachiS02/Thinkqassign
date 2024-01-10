package com.stringassignmnet1;

public class Replacefirstoccurenceofchar
{
    public static void remove(String s,char c)
    {
    	char ch[]=s.toCharArray();

        for(int i=0;i<ch.length;i++)
        {
        	if(ch[i]==c)
        	{
        		ch[i]='#';
        		break;
        	}
        }
        System.out.println(ch);
    
    }
	public static void main(String[] args) {
		
     String s="java";
     char ch='a';
     remove(s, ch);
	}

}
