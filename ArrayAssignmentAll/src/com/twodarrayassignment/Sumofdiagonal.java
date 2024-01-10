package com.twodarrayassignment;

public class Sumofdiagonal 
{
   public static void sumdiagonal(int a[][])
   {
	   int sum1=0,sum2=0;
	   for(int i=0;i<a.length;i++)
	   {
		 
		   for(int j=0;j<a[0].length;j++)
		   {
			   if(i==j)
			   {
				   sum1=sum1+a[i][j];
			   }
			    if((i+j)==(a.length-1))
			   {
				  sum2=sum2+a[i][j];
			   }
			  
		   }
		   
	   }
	   System.out.println("sum of 1diagonal:"+sum1);
	   System.out.println("sum of 2diagonal:"+sum2);
	   
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
		int a[][]={{22, 31, 9}, {12, 5,16}, {34, 42, 2}};
		display(a);
		sumdiagonal(a);
	
		
	}

}
