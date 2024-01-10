package com.foreachloop;

public class Aletranteelementarray 
{
    public static void alternateElement(int a[])
    {
    	int m[]=new int[a.length];
    	int pos=0;
    	
    	for(int i=0;i<a.length;i+=2)
    	{
    		m[pos]=a[i];
    		pos++;
    	}
    	for(int i=1;i<a.length;i+=2)
    	{
    		m[pos]=a[i];
    		pos++;
    		
    	}
    	
    	for(int x:m)
    	{
    		System.out.println(x);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[]= {1,2,3,4,5,6};
         
         for(int x:a)
         {
        	 System.out.println(x);
         }
         
         System.out.println();
         alternateElement(a);
	}

}
