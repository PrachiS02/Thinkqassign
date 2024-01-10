package com.interfaces;
interface Student1
{
	void show();
	default void display()
	{
		System.out.println("I am Student");
	}
}

interface Teacher
{
	void show();
	default void display()
	{
		System.out.println("I am teacher");
	}
}


public class Diamondproblem implements Student1,Teacher
{
	
	

	@Override
	public void show() {
		
		System.out.println("School name: bharati school");
	}
        


	@Override
	public void display() {
	
		Student1.super.display();
		Teacher.super.display();
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Diamondproblem d=new Diamondproblem();
          d.show();
          d.display();
	}


	

}
