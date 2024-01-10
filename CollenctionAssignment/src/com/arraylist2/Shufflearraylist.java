package com.arraylist2;

import java.util.ArrayList;
import java.util.Collections;

public class Shufflearraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ls=new ArrayList<>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		

		System.out.println("before shuffle arraylist:"+ls);
		
		Collections.shuffle(ls);;
		
		System.out.println("after shuffle arraylist:"+ls);
		
	}

}
