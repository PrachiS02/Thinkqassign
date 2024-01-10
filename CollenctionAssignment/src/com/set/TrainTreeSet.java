package com.set;

import java.util.TreeSet;

public class TrainTreeSet {

	public static void main(String[] args) {
	
       TreeSet<Train> ts=new TreeSet<>();
       ts.add(new Train(101,"prachi",1));
       ts.add(new Train(102,"pranay",4));
       ts.add(new Train(103,"pranali",2));
       ts.add(new Train(104,"reetu",8));
       
       for(Train t:ts)
       {
    	   System.out.println(t);
       }
       
	}

}
