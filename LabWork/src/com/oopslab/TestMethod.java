package com.oopslab;

public class TestMethod 
{
   void add(int num1,float num2)
   {
	   System.out.println("addition of int and float:"+(num1+num2));
   }
   void add(float num1,int num2)
   {
	   System.out.println("addition of int and float:"+(num1+num2));
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMethod t1=new TestMethod ();
		t1.add(1f, 5);
		t1.add(5, 1f);
		//t1.add(10, 20);//compile time error ambiguity
	}

}
