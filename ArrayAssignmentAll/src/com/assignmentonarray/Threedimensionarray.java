package com.assignmentonarray;

public class Threedimensionarray
{

	public static void main(String[] args) 
	{
	
     int [][][]a={
    		     {{1,2,3,4},{5,6,7,8},{9,12,34,67}
    		     },
    		     {{13,14,15,16},{17,18,19,20},{21,22,23,24}} 
    		     
    		     };
     
    	
     for(int i=0;i<2;i++)
     {
    	 for(int j=0;j<3;j++)
    	 {
    		 for(int k=0;k<4;k++)
    		 {
    			 System.out.print("a["+i+"]["+j+"]["+k+"]="+a[i][j][k]+"\t");
    		 }
    		  System.out.println("");
    	 }
     }
   
	
	}		 
    	 
    		 
	

}
