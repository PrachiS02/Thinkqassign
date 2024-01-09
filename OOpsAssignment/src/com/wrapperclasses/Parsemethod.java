package com.wrapperclasses;

public class Parsemethod {

	public static void main(String[] args) 
	{
		byte bytevalue=Byte.parseByte("100");
		System.out.println("Byte value:"+bytevalue);
		
		int intvalue=Integer.parseInt("100");
		System.out.println("Int value:"+intvalue);
		
		short shortvalue=Short.parseShort("100");
		System.out.println("Short value:"+shortvalue);
		
	    double doublevalue=Double.parseDouble("100");
		System.out.println("Double value:"+doublevalue);
		
		float floatvalue=Float.parseFloat("100");
		System.out.println("Float value:"+floatvalue);
		
		
	}

}
