package com.overriding;

class Person
{
	void display()
	{
		System.out.println("I am person");
	}
}
class Employee extends Person
{
	@Override
    public void display()
	{
		
		super.display();
		System.out.println("I am Employee");
	}
}
public class Override1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Person p1 =new Person();
      p1.display();
      
      Employee e1=new Employee();
      e1.display();
    		  
	}

}
