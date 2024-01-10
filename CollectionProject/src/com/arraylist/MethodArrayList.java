package com.arraylist;

import java.util.ArrayList;

public class MethodArrayList {

	public static void main(String[] args)
	{

        ArrayList<String> a1=new ArrayList(5);
        System.out.println(a1.isEmpty());
        a1.add("Kiwi");
        a1.add("Oranges");
        a1.add("Apple");
        a1.add("cherries");
        a1.add("Banana");
        a1.add(null);
        a1.add("apple");
        
        System.out.println(a1);
        System.out.println(a1.isEmpty());
        
        System.out.println("--------------------------------------------");
        
        a1.add(2, "Guava");//shifting 
        System.out.println(a1);
        
        System.out.println("---------------------------------------");
        
        a1.set(2,"Watermelon");//value change
        System.out.println(a1);
        
        System.out.println("--------------------------------------------");
        
        System.out.println(a1.remove(2));
        
        System.out.println("---------------------------------------------");
        
        System.out.println(a1.remove("Banana"));
        System.out.println("--------------------------------------------------------");
        
        ArrayList<String> a12=new ArrayList<>();
        a12.add("Strawberry");
        a12.add("Banana");
        System.out.println(a1);
        System.out.println(a12);
        
        System.out.println("-----------------------------------------");
        
        a1.addAll(a12);
        System.out.println(a1);
        
        System.out.println("----------------------------------------------");
        
        
        a1.addAll(2,a12);
        System.out.println(a1);
        
        System.out.println(a1.contains("Banana"));
        System.out.println(a1.contains("Kiwi"));
        
        System.out.println("----------------------------------------");
        
        
        
        
        
        
        
	}

}
