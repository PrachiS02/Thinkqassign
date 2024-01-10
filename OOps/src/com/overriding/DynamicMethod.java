package com.overriding;
class Myperson
{
	void display()
	{
		
		System.out.println("I am person");
	}
}
class Myemployee extends Myperson
{
	public void display()
	{
		
		System.out.println("I am Employee");
	}
	void show()
	{
		System.out.println("Employee having skills");
	}
}
class Mycelebrity extends Myperson
{
	public void display()
	{
		
		System.out.println("I am Celebrity");
	}
	void show()
	{
		System.out.println("celebrity having skills");
	}
}
public class DynamicMethod {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Myperson p1=new  Myperson();
      p1.display();
      
      Myemployee e1=new Myemployee();
      e1.display();
      e1.show();
      
      System.out.println("--------------------------------------");
      
      Myperson p;
      p=new Myperson();
      p.display();
      
      p=new Myemployee();
      p.display();
      
      p=new Mycelebrity();
      p.display();
	}

}
