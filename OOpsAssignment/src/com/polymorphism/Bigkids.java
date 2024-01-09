package com.polymorphism;

class Kid1
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
class Bigkid extends Kid1
{
	void readBook()
	{
		super.readBook();
		System.out.println("Big kid reading....");
	}
}
public class Bigkids {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Bigkid bk=new Bigkid();
      bk.readBook(5);
      bk.readBook();
	}

}
