package com.assignmentonarray;

public class minvalcolumn
{
	public static void minnumcolumn(int[][]a)
    {
//   	 int[] b = a[0];
//	    for (int i = 1; i < a.length; i++)
//	    {
//	        for (int j = 0; j< a[0].length; j++) 
//	        {
//	            if (a[i][j] <b[j]) 
//	            {
//	                b[j] =a[i][j];
//	            }
//	        }
//	    }
//	   for (int number: b) {
//	 		System.out.print(number + " ");
//	 	}
		for(int i=0;i<a[0].length;i++)
		{
			int min=a[0][i];
			for(int j=1;j<a.length;j++)
			{
				if(min>a[j][i])
				{
					min=a[j][i];
				}
			}
			System.out.print(min+" ");
		}
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,  9,  3, 5}, 
				     {4, 19, 11, 9},
				     {2, 10, 5, 6}};
	    minnumcolumn(a);
	}

}
