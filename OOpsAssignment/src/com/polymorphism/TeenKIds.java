package com.polymorphism;
class Kid2
{
void readBook()
{
	
	System.out.println("Kid Book1....");
}
void readBook(int n)
{
	System.out.println("Kid Book2....");
}
}
class Bigkid1 extends Kid2
{
	void readBook()
	{
		//super.readBook();
		System.out.println("Big kid reading....");
	}
}
class Teenager extends Kid2
{
	void readBook()
	{
		
		System.out.println("Teenager Book1....");
	}
}
public class TeenKIds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bigkid1 k1;
        k1=new Bigkid1();
        k1.readBook();
        
        Teenager k2;
        k2=new Teenager();
        k2.readBook();
        
	}

}
