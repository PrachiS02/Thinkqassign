package com.arraylistassignment;

import java.util.ArrayList;

public class FrequencyArrayList
{
     static void findFrequency(ArrayList<String> list)
     {
    	 int count=0;
    	 for(int i=0;i<list.size();i++)
    	 {
    		 count=1;
    		 if(list.get(i).equals("visited"))
    			   continue;
    		 for(int j=i+1;j<list.size();j++)
    		 {
    			 if(list.get(i).equals(list.get(j)))
    			 {
    				 count++;
    				 list.set(j, "visited");
    			 }
    		 }
    		 System.out.println(list.get(i)+"->"+count);
    		 
    	 }
    	
     }
	public static void main(String[] args) {
		
         ArrayList<String> al=new ArrayList<>();
         al.add("A");
         al.add("B");
         al.add("C");
         al.add("A");
         al.add("A");
         al.add("B");
         
         findFrequency(al);
         
	}

}
