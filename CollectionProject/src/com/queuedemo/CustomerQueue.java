package com.queuedemo;

import java.util.PriorityQueue;

public class CustomerQueue {

	public static void main(String[] args) {
		
        PriorityQueue<Customer> pcq=new PriorityQueue<>(new CustomerComparator());
        
        pcq.add(new Customer(101,1,"Pranay"));
        pcq.add(new Customer(102,3,"Pranali"));
        pcq.add(new Customer(104,1,"Prachi"));
        pcq.add(new Customer(106,2,"Arpita"));
        pcq.add(new Customer(103,2,"Bhaskar"));
        
        for(Customer c:pcq)
        {
        	System.out.println(c);
        }
        
	}

}
