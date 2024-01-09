package com.ovveriding;
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
		//super.readBook();
		System.out.println("Big kid reading....");
	}
}
public class Kids {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Kid1 k1=new Kid1();
    k1.readBook();
    k1.readBook(5);
    
    Bigkid b1=new Bigkid();
    b1.readBook();
	}

}
