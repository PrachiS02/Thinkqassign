package com.operator;

public class IncDec10 {

	public static void main(String[] args) {
	
		int x = 001, y=010, z=100;
        
        int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
        System.out.println("x="+x);
        System.out.println("y="+y);//my ans 011
        System.out.println("z="+z);
        System.out.println("i="+i);

	}

}
