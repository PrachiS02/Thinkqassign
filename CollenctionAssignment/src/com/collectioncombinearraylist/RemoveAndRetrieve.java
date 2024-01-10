package com.collectioncombinearraylist;

import java.util.LinkedList;
import java.util.Queue;

public class RemoveAndRetrieve {

	public static void main(String[] args) {

		Queue<String> q=new LinkedList<String>();
	      q.add("black");
	      q.add("blue");
	      q.add("red");
	      q.add("yellow");
	      
	      System.out.println(q);
	      q.remove();
	      System.out.println(q);
	}

}
