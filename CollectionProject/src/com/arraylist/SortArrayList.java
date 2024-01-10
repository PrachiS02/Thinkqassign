package com.arraylist;

import java.util.ArrayList;

public class SortArrayList 
{
   static void sortList(ArrayList<Integer> list)
   {
	   for(int i=0;i<list.size();i++)
	   {
		   for(int j=i+1;j<list.size();j++)
		   {
			   if(list.get(i)>list.get(j))
			   {
				   int temp=list.get(i);
				   list.set(i, list.get(j));
				   list.set(j, temp);
			   }
		   }
	   }
   
   }
	public static void main(String[] args) {
       ArrayList<Integer> al=new ArrayList<>();
       al.add(78);
       al.add(90);
       al.add(1);
       al.add(13);
       al.add(15);
       
       System.out.println("before arraylist:"+al);
       sortList(al);
       System.out.println("after arraylist:"+al);
	}

}
