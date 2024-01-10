package com.stringassignmnet1;

public class Highfrequency
{
    public static void highfrequency(String s)
    {
       int count;
       int maxcount=0;
       char maxFreqchar=' ';
       s=s.toLowerCase();
       
       for(int i=0;i<s.length();i++)
       {
    	   if(s.charAt(i)==' ')
    	   {
    		   continue;
    	   }
    	   count=1;
    	   for(int j=i+1;j<s.length();j++)
    	   {
    		   if(s.charAt(i)==s.charAt(j))
    			   count++;
    	   }
    	   if(count>maxcount)
    	   {
    		   maxcount=count;
    		   maxFreqchar=s.charAt(i);
    	   }
       }
       System.out.println("highest frequency character is:"+maxFreqchar+"-->"+maxcount);
    }
	public static void main(String[] args) 
	{
		
      String s="abbbcd";
      highfrequency(s);   
       
	}

}
