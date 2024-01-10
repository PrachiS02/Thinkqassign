package com.stringassignmnet1;

public class Firstoccurenceofchar
{
    public static void firstoccurencechar(String s, char ch)
    {
    	char ch1[]=s.toCharArray();
    	
    	int loc=0;
    	for(int i=ch1.length-1;i>=0;i--)
    	{
    		if(ch1.equals(ch1))
    		{
    			loc=i;
    		}
    	}
    	System.out.println(ch+" is first occurence character at " +loc);
    	
    	
    }
	public static void main(String[] args)
	{
		String s="javaj";
		char ch='j';
		firstoccurencechar(s, ch);
      
	}

}
