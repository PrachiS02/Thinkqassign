package com.lab;

public class Computerfun
{
    public static void printpattern(String s)
    {
    	int sp1=s.indexOf(' ');
    	int sp2=s.lastIndexOf(' ');
    	System.out.println(s.substring(sp2+1,s.length())+" "+s.substring(sp1, sp2)+" "+s.substring(0,sp1));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="Computer is fun";
        printpattern(str);
	}

}
