package com.abstract1;
abstract class abstract1
{
	public abstract1()
	{
		System.out.println("this is constructor of abstract class");
	}
	
	abstract void a_method();
	
	void nonabstractmethod()
	{
		System.out.println("this is normal method of abstract class");
	}
}
class Subclass extends abstract1
{

	@Override
	void a_method()
	{
		
		System.out.println("this is abstract method");
	}
	}
 public class Abstractcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Subclass sc=new Subclass();
      sc.a_method();
      sc.nonabstractmethod();
     
	}

}
