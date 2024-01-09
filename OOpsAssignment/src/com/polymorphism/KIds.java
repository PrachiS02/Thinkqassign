package com.polymorphism;
class Kid
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

public class KIds
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Kid kd=new Kid();
       kd.readBook();
       kd.readBook(5);
	}

}
