package com.superkeyword;

class Parent
{
	int num = 10;

}

class Child extends Parent 
{
	int num = 20;

	void display() 
	{
		System.out.println("Child Class Num: " + num);
		System.out.println("Parent Class Num: " + super.num);
	}
}

public class Instancevariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Child c = new Child();
		    c.display();

	}

}
