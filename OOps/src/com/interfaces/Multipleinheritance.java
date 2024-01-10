package com.interfaces;
@FunctionalInterface
interface showable
{
	void display();
	
}
interface printable
{
	void display();
}
class Demo implements showable,printable
{

	@Override
	public void display() {
	   System.out.println("welcome....");
		
	}
	}
public class Multipleinheritance {

	public static void main(String[] args) {
		
          Demo d=new Demo();
          d.display();
        
	}

}
