package com.arraylistassignment;

import java.util.ArrayList;

public class Retainall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<Integer> ls=new ArrayList<>();
         
         ls.add(1);
         ls.add(2);
         ls.add(3);
         
         ArrayList<Integer> ls1=new ArrayList<>();
         
         ls1.add(1);
         ls1.add(4);
         ls1.add(3);
         
         ls.retainAll(ls1);
         
         System.out.println(ls);
         
	}

}
