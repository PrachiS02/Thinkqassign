package com.stringbufferbuilder;

public class Demobuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       StringBuffer sb=new StringBuffer();
       System.out.println(sb.capacity());//by default 16
       
       StringBuffer sb1= new StringBuffer(4);
       System.out.println(sb1.capacity());
       
       sb1.append("javas");//(cuurent capacity*2)+2
       
       System.out.println(sb1+" "+sb1.capacity());
       System.out.println(sb1+" "+sb1.length());
       
    		   
	}

}
