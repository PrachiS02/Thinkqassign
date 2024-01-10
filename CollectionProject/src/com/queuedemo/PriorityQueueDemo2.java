package com.queuedemo;

import java.util.PriorityQueue;

public class PriorityQueueDemo2 {

	public static void main(String[] args) {
     PriorityQueue<String> pq=new PriorityQueue<>();
     pq.add("Prachi");
     pq.add("Pranay");
     pq.add("abc");
     pq.add("xyq");
     pq.add("raj");
     pq.add("roy");
     //pq.add(null); null not allowed
     
     System.out.println(pq);
     
     System.out.println(pq.peek());
     
     System.out.println(pq.offer(null));
     
	}

}
