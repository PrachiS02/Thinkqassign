package com.queuedemo;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args)
	{
       ArrayDeque<Float> adq=new ArrayDeque<>();
       adq.add(78.4f);
       adq.add(34.3f);
       adq.add(98.4f);
       //maintain insertion order
       //duplicate is allowed
       
       //adq.add(null);//it follows interface queue
       adq.addFirst(89.4f);
       
       System.out.println(adq);
       
       System.out.println(adq.peekFirst());
       System.out.println(adq.poll());
      
       

	}

}
