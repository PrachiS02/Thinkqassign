package com.twodarrayassignment;

public class Sparsematrix
{
    public static void checksparxmatrix(int a[][])
    {
    	int row=a.length;
    	int col=a[0].length;
    	int count=0;
    	
    	for(int i=0;i<row;i++)
    	{
    		for(int j=0;j<col;j++)
    		{
    			if(a[i][j]==0)
    			{
    				count++;
    			}
    		}
    	}
    	
    	if(count>row)//(row*col/2)
    	{
    		System.out.println("sparse matrix");
    	}
    	else
    	{
    		System.out.println("not sparx matrix");
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
      int a[][]= {{1,0,4},{0,0,5},{9,0,0}};
      display(a);
      System.out.println("----------------------------");
      checksparxmatrix(a);
	}

}
