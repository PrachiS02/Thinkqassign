package com.queuestack;


import java.util.LinkedList;
import java.util.Queue;

public class NonGenericQueueDemo {

	public static void main(String[] args) 
	{
		Queue queue = new LinkedList();

	       
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        
        System.out.println(queue);
        

      
      

	}

}
