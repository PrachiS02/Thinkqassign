package com.inheritance;

class Student
{
   void play()
   {
	   System.out.println("playing cricket");
   }
}
class Bob extends Student
{
	void study()
	{
	System.out.println("studying physics");
	}
}
public class SingleInheritance{

	public static void main(String[] args) {
		Bob d=new Bob();
		d.study();
		d.play();

	}

}
