package com.assignmentonarray;

public class Minvalrow
{
	public static void minnumrow(int[][]a)
	{
		
		for(int i=0;i<a.length;i++)
		{
			int min=a[i][0];
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
				}
			}
			System.out.print(min+" ");
		}
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] a = {{3, 9, 1, 5},
				      {2, 19, 4, 9},
				      {4, 10, 5, 6}};
		    minnumrow(a);
	}

}
