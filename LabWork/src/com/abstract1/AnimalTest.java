package com.abstract1;
abstract class Animal
{
	abstract void voice();
}
class Cat extends Animal
{

	@Override
	void voice() 
	{
		System.out.println("cat meow meow");
		
	}
}
class Dog extends Animal
{

	@Override
	void voice() 
	{
		System.out.println("Dog barks ");
		
	}
	
}
public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Animal a;
       a=new Cat();
       a.voice();
       
       a=new Dog();
       a.voice();
	}

}
