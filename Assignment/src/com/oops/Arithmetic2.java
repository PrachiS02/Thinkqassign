package com.oops;

public class Arithmetic2 
{
	   int a=10;
	   int b=20;
	   
	   void add()
	   {
		   int add=a+b;
		   System.out.println("addition: "+add);
	   }
	   void sub()
	   {
		   int sub=a-b;
		   System.out.println("substraction: "+sub);
	   }
	   void mul()
	   {
		   int mul=a*b;
		   System.out.println("multiplication: "+mul);
	   }
	   void div()
	   {
		   int div=a/b;
		   System.out.println("division: "+div);
	   }
	   void modulus()
	   {
		   int mod=a%b;
		   System.out.println("modulus: "+mod);
	   }
	 public static void main(String[] args)
	 {
	
         Arithmetic2 a1=new Arithmetic2();
         a1.add();
         a1.mul();
         a1.sub();
         a1.div();
         a1.modulus();
	 }

}
