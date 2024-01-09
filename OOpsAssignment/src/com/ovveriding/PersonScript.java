package com.ovveriding;

class Person
{
	void readScript()
	{
		System.out.println("person is reading script");
	}
}
class Actor extends Person
{
	void readScript()
	{
		super.readScript();
		System.out.println("Actor is reading script");
	}
}

public class PersonScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Actor a=new Actor();
       a.readScript();
	}

}
