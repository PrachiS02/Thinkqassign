package com.oops;

public class Arithmetic 
{
   int a;
   int b;
   
   void add(int a,int b)
   {
	   int add=a+b;
	   System.out.println("addition: "+add);
   }
   void sub(int a,int b)
   {
	   int sub=a-b;
	   System.out.println("substraction: "+sub);
   }
   void mul(int a,int b)
   {
	   int mul=a*b;
	   System.out.println("multiplication: "+mul);
   }
   void div(int a,int b)
   {
	   int div=a/b;
	   System.out.println("division: "+div);
   }
   void modulus(int a,int b)
   {
	   int mod=a%b;
	   System.out.println("modulus: "+mod);
   }
	public static void main(String[] args)
	{

         Arithmetic a1=new Arithmetic();
         a1.add(10, 20);
         a1.sub(10, 200);
         a1.mul(10, 200);
         a1.div(12, 60);
        a1.modulus(20, 100);
	}

}
