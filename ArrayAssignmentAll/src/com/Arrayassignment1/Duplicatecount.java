
//23. WAJP2 find and count total number of duplicate elements in an 
//array.
package com.Arrayassignment1;

import java.util.Arrays;

public class Duplicatecount 
{
	
	public static void duplicatecount(int a[])
    {
   	  int count;
   	  boolean status;
   	  
   	  for(int i=0;i<a.length;i++)
   	  {
   		  count=1;
   		  status=false;
   		  for(int j=i-1;j>=0;j--)
   		  {
   			  if(a[i]==a[j])
   			  {
   				  status=true;
   				  break;
   			  }
   		  }
   		  if(status==false)
   		  {
   			  for(int k=i+1;k<a.length;k++)
   			  {
   				  if(a[i]==a[k])
   					  count++;
   			  }
   			 
    			  System.out.println(a[i]+"--> "+count);
    			  if(count>1)
  				  System.out.println(a[i]);
   		  }
   	  }
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,2,3,10,4,10,2,4};
        System.out.println(Arrays.toString(a));
        duplicatecount(a);
	}

}
