package com.twodarrayassignment;

public class Sumofeachrow 
{
   public static void sumofeachrow(int a[][])
   {
	   int sum=0;
	   for(int i=0;i<a.length;i++)
	   {
		   sum=0;
		   for(int j:a[i])
		   {
			   sum+=j;
		   }
		   System.out.println((i+1)+"row sum:"+sum);
		   
	   }
	   System.out.println("--------------------------");
   }
   
   public static void sumofeachcol(int a[][])
   {
	   int sum=0;
	   for(int i=0;i<a[0].length;i++)
	   {
		   sum=0;
		   for(int j=0;j<a.length;j++)
		   {
			   sum+=a[j][i];
		   }
		   System.out.println((i+1)+"column sum:"+sum);
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
		int a[][]={{22, 31, 9}, {12, 5,16}, {34, 42, 2}};
		display(a);
		System.out.println("-------------------------");
		sumofeachrow(a);
		sumofeachcol(a);
	}

}
