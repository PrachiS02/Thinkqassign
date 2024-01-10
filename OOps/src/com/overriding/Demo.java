package com.overriding;
class Pers
{
	void display()
	{
		System.out.println("I am person");
	}

	
}
class Employee1 extends Pers
{
   
     public void display()
	{
	   super.display();
		System.out.println("I am Employee");
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pers p1 =new Pers();
	      p1.display();
	      
	      Employee1 e1=new Employee1();
	      e1.display();
	}

}
