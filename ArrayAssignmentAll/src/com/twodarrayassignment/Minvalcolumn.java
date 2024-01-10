//4.	WAP to print minimum in columns. Means e.g. arr[][]={{22, 31, 9}, {12, 5, 		16}, {34, 42, 2}} output is: 12, 5, 2.
package com.twodarrayassignment;

public class Minvalcolumn 
{
	public static void minnumcolumn(int[][]a)
	{
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
		System.out.println(i+" row min val: "+min);
	}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{22, 31, 9}, {12, 5,16}, {34, 42, 2}};
		minnumcolumn(a);
	}

}

