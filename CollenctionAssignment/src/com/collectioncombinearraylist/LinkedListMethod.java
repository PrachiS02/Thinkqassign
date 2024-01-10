package com.collectioncombinearraylist;

import java.util.LinkedList;

public class LinkedListMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList comp=new LinkedList();
		comp.add("HCL");
        comp.add("Infosys");
        comp.add("TCS");
        comp.add("capgemini");
        
        System.out.println(comp);
        comp.addFirst("TATA");
        comp.addLast("Tech");
        comp.getFirst();
        comp.getLast();
        comp.removeFirst();
        comp.removeLast();
        System.out.println(comp);
        
        
	}

}
