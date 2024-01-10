package com.innerdemo;
class Parent
{
	static int num1=90;
	int num2=100;
	
	void display()
	{
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
	}
	static class Inner
	{
		
		String msg1="hello";
		static String msg2="welcome";
		
		void show()
		{
			System.out.println("num1"+num1);
		//System.out.println("num2"+num2);
			
			System.out.println("Message:"+msg1);
			System.out.println("Message:"+msg2);
			
			Parent p1=new Parent();
			p1.display();
		}
	}

}
public class Staticinnerclass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Parent.Inner p1=new Parent.Inner();
		p1.show();
		
		Parent p2=new Parent();
		p2.display();

	}

}
