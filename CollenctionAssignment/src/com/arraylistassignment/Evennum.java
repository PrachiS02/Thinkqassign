package com.arraylistassignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Evennum {

	public static void main(String[] args) {

         ArrayList<Integer> ls=new ArrayList<>();
         
         for(int i=1;i<=50;i++)
         {
        	 ls.add(i);
         }
         
         Iterator<Integer> iterator=ls.iterator();
         
         while(iterator.hasNext())
         {
        	 int num=iterator.next();
        	 
        	 if(num%2==0)
        	 {
        		System.out.println(num+" ");
        	 }
         }
	}

}
