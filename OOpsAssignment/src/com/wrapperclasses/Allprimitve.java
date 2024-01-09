package com.wrapperclasses;

public class Allprimitve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//boxing
		int num = 23;

		Integer i1 = new Integer(45);
		Integer i2 = 78;

		Integer j = Integer.valueOf(num);
		
		System.out.println(i1+" "+i2+" "+j);

		float n=12.089f;
		
		Float f1=Float.valueOf(n);
		System.out.println(n);
		
		double d=5.5;
		Double d1=Double.valueOf(d);
		System.out.println(d);
		
		boolean b=true;
		Boolean b1=Boolean.valueOf(b);
		System.out.println(b);
		
		short s=225;
		Short s1=Short.valueOf(s);
		System.out.println(s);
		
		long l=123455;
		Long l1=Long.valueOf(l);
		System.out.println(l);
		
		System.out.println("unboxing...........");
		//unboxing
		Float f=12.089f;
		float f2=f1.floatValue();
		System.out.println(f2);
		
		Long sc=1234l;
		long ll=sc.longValue();
		System.out.println(ll);
		
		Short sh=225;
		short sh1=sh.shortValue();
		System.out.println(sh1);
		
		Integer i=23;
		int i3=i.intValue();
		System.out.println(i3);
		
		Double dd=23.3;
		double d3=dd.doubleValue();
		System.out.println(d3);
		
		Boolean bb=false;
		boolean b11=bb.booleanValue();
        System.out.println(b11);
		
		
	}
	
}
