package com.queuestack;

import java.util.LinkedList;
import java.util.Queue;

public class RemoveTwoMethods {

	public static void main(String[] args) {

		Queue<String> q=new LinkedList<String>();
	      q.add("black");
	      q.add("blue");
	      q.add("red");
	      q.add("yellow");
	      
	      System.out.println(q);
	      q.poll();
	     
	      //q.removeAll(q);
	      System.out.println(q);
	}

}
