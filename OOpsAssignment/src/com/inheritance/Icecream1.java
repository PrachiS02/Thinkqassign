package com.inheritance;
class Icecream
{
	void eat()
	{
		System.out.println(" I am eating icecream");
	}
    
}
class Juice extends Icecream
{
	void drink()
	{
		System.out.println("I am drinking juice");
	}
}
class Mastani extends Juice
{
	{
	super.eat();
	super.drink();
    }

	
}
public class Icecream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Mastani m=new Mastani();
      
	}

}
