package com.linkedlistassignment;

import java.util.LinkedList;

public class Occurence {

	
		
		public static void findOccuranceFirst(LinkedList<String> list,String word)
		{
			for(int i=0;i<list.size();i++)
			{
			   if(list.get(i).equalsIgnoreCase(word))
				   System.out.println(word+" fisrt occurance at "+i);
			   break;
			}
		}
		
		public static void findOccuranceLast(LinkedList<String> list,String word)
		{
			
			for(int i=list.size()-1;i>=0;i--)
			{
			   if(list.get(i).equalsIgnoreCase(word))
				   System.out.println(word+" last occurance at "+i);
			   break;
			}
		
		
	
		}
		public static void main(String[] args)
		{
			LinkedList<String> color = new LinkedList<String>();

			color.add("Red");
			color.add("pink");
			color.add("White");
			color.add("yellow");
			color.add("blue");

			System.out.println(color);
			
			//System.out.println(color.removeFirstOccurrence("Red"));
			
			findOccuranceFirst(color, "pink");
			findOccuranceLast(color, "yellow");
			
			

	}

}

