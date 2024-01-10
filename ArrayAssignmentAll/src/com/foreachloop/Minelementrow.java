package com.foreachloop;

public class Minelementrow 
{
   public static void findminvalrow(int a[][])
   {
	   for(int i=0;i<a.length;i++)
	   {
		   int min=a[i][0];
		   for(int j=0;j<a[0].length;j++)
		   {
			   if(a[i][j]<min)
			   {
				   min=a[i][j];
			   }
		   }
		   System.out.println("minimum value in row:"+min);
	   }
	   
	   
   }
   public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[][]= {{22,31,9},{12,25,16}};
     
     for(int[] x:a)	 
     {
    	 for(int v:x)
    	 {
    		 System.out.println(v);
    	 }
    	 System.out.println();
    	 
     }
     
     findminvalrow(a);
	}

}
