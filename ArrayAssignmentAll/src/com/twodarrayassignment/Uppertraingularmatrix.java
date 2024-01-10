package com.twodarrayassignment;

public class Uppertraingularmatrix 
{
	public static void uppermatrix(int a[][])
	{
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				if((i+j)<len)
		 		{
					System.out.print(a[i][j]+" ");
				}
				
			}
			System.out.println();
		}
	}
	
	public static void lowermatrixsum(int a[][])
	{
		int len=a.length;
		int sum=0;
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				if((i+j)>=len)
		 		{
					System.out.print(a[i][j]+" ");
				}
				
			}
			System.out.println();
		}
	}
	
	
	
	public static void display(int a[][])
    {
    	for(int i=0;i<a.length;i++)
    	{
    		for(int j:a[i])
    		{
    			System.out.print(j+" ");
    		}
    		System.out.println();
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[][]= {{1,1,1,1},{1,1,1,0},{1,1,0,0},{1,0,0,0}};
         display(a);
         System.out.println("----------------------------------------");
         uppermatrix(a);
         System.out.println("---------------------------------------");
         lowermatrixsum(a);
         
	}

}
