package com.twodimensionalarray;

public class Transposematrix

{
     static int[][] findTranspose(int a1[][])
     {
    	 int cols=a1.length;
    	 int rows=a1[0].length;
    	 
    	 int tarr[][]=new int[rows][cols];
    	 for(int i=0;i<rows;i++)
    	 {
    		 for(int j=0;j<cols;j++)
    		 {
    			 tarr[i][j]=a1[j][i];
    		 }
    	 }
		return tarr;
     }
     
     static void display(int a1[][])
     {
    	 for(int i=0;i<a1.length;i++)
         {
       	    for(int j:a1[i])
       	  {
              System.out.print(j+" ");
       	  }
       	  System.out.println();
         }
    	 System.out.println("-------------------------");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int m[][] = {{1,2,3},{3,4,5}};
	      
	      display(m);
	      
	      int result[][]=findTranspose(m);
	      display(result);
	}

}
