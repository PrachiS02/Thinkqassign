package com.arraylist2;

import java.util.ArrayList;

public class ReverseArrayList 
{
	static void reversearraylist(ArrayList<String> list)
	{
		for(int i=0,j=list.size()-1;i<list.size();i++,j--)
		{
			String temp=list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
			
		}
	}

	public static void main(String[] args) {

		ArrayList<String> a1=new ArrayList<>();
		a1.add("Kiwi");
        a1.add("Oranges");
        a1.add("Apple");
        a1.add("cherries");
        a1.add("Banana");
        
        System.out.println(a1);
        
       reversearraylist(a1);
       System.out.println(a1);
	}

}
