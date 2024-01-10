package com.stringassignmnet1;

public class Lastoccurchar 
{
   public static void lastOccurchar(String s,char ch)
   {
	   char ch1[]=s.toCharArray();
	   int loc=0;
	   for(int i=0;i<ch1.length;i++)
	   {
		   if(ch1.equals(ch1))
		   {
			   loc=i;
			  
		   }
	   }
	   System.out.println(ch+" is last occurence at "+loc);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="jjavajj";
      char ch='j';
      lastOccurchar(s, ch);
	}

}
