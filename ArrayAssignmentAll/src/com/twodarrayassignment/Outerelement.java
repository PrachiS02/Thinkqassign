package com.twodarrayassignment;

public class Outerelement
{
    public static void outerelement(int a[][])
    {
    	for(int i=0;i<4;i++)
    	{
    		for(int j=0;j<4;j++)
    		{
    		  if((i==0)||(i==3)||(j==0)||(j==3))
    		   {
			     System.out.print(a[i][j]+" ");
			   }		
    		  else
    	
    			  System.out.print("  ");
    	
    		}	
    		System.out.println("");
    	}
    }
    
    public static void display(int a[][])
    {
    	for(int i=0;i<4;i++)
    	{
    		for(int j:a[i])
    		{
    			System.out.print(j+" ");
    		}
    		System.out.println();
    	}
    }
	public static void main(String[] args)
	{
		int a[][]= {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
		display(a);
		System.out.println("------------------------------");
		outerelement(a);
		

	}

}
