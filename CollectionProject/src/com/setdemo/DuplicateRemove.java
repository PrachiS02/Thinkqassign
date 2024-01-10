package com.setdemo;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> al=new ArrayList<>();
        al.add("java");
        al.add("python");
        al.add("angular");
        al.add("spring");
        al.add("java");
        
        System.out.println(al);
        
        HashSet<String> hs=new HashSet<>(al);
        
        System.out.println(hs);
        
        
	}

}
