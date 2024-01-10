//4. WAJP2 find the index of an array element value. 
package com.Arrayassignment1;

import java.util.Arrays;

public class Indexarray
{
    public static void checkindex(int a[],int n)
    {
    	int index=0;
    	for(int i=0;i<a.length;i++)
    	{
    		if(a[i]==n)
    		{
    			System.out.println(n+" number at "+(i)+" index");
    			index++;
    		}
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {4,6,7,8,9,1,2};
        System.out.println(Arrays.toString(a));
        checkindex(a,2);
	}

}
