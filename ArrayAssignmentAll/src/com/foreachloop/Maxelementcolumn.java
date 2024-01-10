package com.foreachloop;

public class Maxelementcolumn 
{
   public static void maxelementcol(int a[][])
   {
	   for(int i=0;i<a[0].length;i++)
	   {
		   int max=a[0][i];
		   for( int j=1;j<a.length;j++)
		   {
			   if(a[j][i]>max)
			   {
				   max=a[j][i];
			   }
		   }
		System.out.println("max number of column:"+max);  
		   
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[][]= {{22,31,9},
        		    {12,5,16},
        		    {34,42,2}};
        
        for(int [] x:a)
        {
        	for(int val:x)
        	{
        		System.out.println(val);
        	}
        	System.out.println();
        }
        
        maxelementcol(a);
	}

}
