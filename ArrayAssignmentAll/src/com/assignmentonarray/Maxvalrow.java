package com.assignmentonarray;

public class Maxvalrow 
{
	public static void maxnumrow(int[][]a)
	{
		for(int i=0;i<a.length;i++)
		{
			int max=0;
			for(int j=0;j<a.length;j++)
			{
				if(max<a[i][j])
				{
					max=a[i][j];
				}
			}
			System.out.print(max+" ");
		}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] a = {{3, 9, 3, 5},
				     {4, 19, 4, 9},
				     {2, 10, 5, 6}};
		    maxnumrow(a);
	}

}
