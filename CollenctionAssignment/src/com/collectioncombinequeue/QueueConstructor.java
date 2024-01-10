package com.collectioncombinequeue;


import java.util.PriorityQueue;
import java.util.Queue;

public class QueueConstructor {

	public static void main(String[] args) {

		Queue<String> q=new PriorityQueue<String>();
	      q.add("black");
	      q.add("blue");
	      q.add("red");
	      q.add("yellow");
	      
	      System.out.println("default constructor:"+q);
	   
	      Queue<Integer> q1=new PriorityQueue<Integer>(3);
	      q1.add(1);
	      q1.add(2);
	      q1.add(3);
	      
	      System.out.println("initial capacity:"+q1);
	      
	      Queue<Integer> q3=new PriorityQueue<Integer>(q1);
	      System.out.println("passing collection:"+q3);
	      
	      
	      
	     
	}

}
