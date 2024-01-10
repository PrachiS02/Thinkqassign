package com.collectioncombinearraylist;

import java.util.LinkedList;

public class REplaceLinledListElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList comp=new LinkedList();
		comp.add("HCL");
        comp.add("Infosys");
        comp.add("TCS");
        comp.add("capgemini");
        
        System.out.println(comp);
        comp.add(2, "techpride");
        System.out.println(comp);
	}

}
