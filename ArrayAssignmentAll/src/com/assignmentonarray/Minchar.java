//7. WAP to find min character in character array. Means e.g. arr[] = [‘A’, ‘D’, ‘E’, ‘x’, ‘z’, 
//‘R’], so min character is ‘A’. 
package com.assignmentonarray;

import java.util.Arrays;

public class Minchar
{
     static void findmin(char a[])
     {
    	 for(int i=0;i<a.length;i++)
    	 {
    		 for(int j=i+1;j<a.length;j++)
    		 {
    			 if(a[i]>a[j])
    			 {
    				 char min=a[i];
    				 a[i]=a[j];
    				 a[j]=min;
    			 }
    		 }
    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     char a[]= {'A','B','c','d','Z','E'};
     findmin(a);
     System.out.println(Arrays.toString(a));
     System.out.println("min character:"+a[0]);
     System.out.println("max character:"+a[a.length-1]);
     
     
	} 

}
