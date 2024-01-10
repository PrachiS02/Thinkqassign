package com.throwskeyword;

public class Uncheckedpropogate 
{
   void method1()
   {
	   throw new ArithmeticException("divide by zero");
   }
   void method2()
   {
	   
	   
	   method1();
	   
   }
   void method3()
   {
	   method2();
   }
	public static void main(String[] args) {
		
     Uncheckedpropogate uc=new Uncheckedpropogate();
     uc.method3();
	}

}
