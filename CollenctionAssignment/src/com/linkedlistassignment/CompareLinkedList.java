package com.linkedlistassignment;

import java.util.LinkedList;

public class CompareLinkedList {

	
		public static boolean compareList(LinkedList<Integer> list1,LinkedList<Integer> list2)
		{
		   list1.sort(null);
		   System.out.println(list1);
		   list2.sort(null);
		   System.out.println(list1);
			
			boolean status=false;
			if(list1.size()!=list2.size())
			{
			    status=false;
			    return status;
			}
			else
			{
				for(int i=0;i<list1.size();i++)
						if(list1.get(i).equals(list2.get(i)))
					          status=true;
						else
						{
							status=false;
						}
					
			}
			
			return status;     		
		}

		public static void main(String[] args) {
			
			LinkedList<Integer> num1 = new LinkedList<>();

			num1.add(1);
			num1.add(2);
			num1.add(3);
			num1.add(4);
			num1.add(5);

			LinkedList<Integer> num2 = new LinkedList<>();

			num2.add(1);
			num2.add(2);
			num2.add(3);
			num2.add(4);
			num2.add(5);
			
			if(compareList(num1, num2))
				System.out.println("Linked lists are equal");
			else
				System.out.println("Linked lists are not equal");

	}

}
