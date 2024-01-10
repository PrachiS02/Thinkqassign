package com.constructor;

class Demo
{
	int a;
	int b;
	String name;
	
	Demo()
	{
		//a=10;
		//b=10;
		//name="prachi";
		this(10,10);// 2) constr chaining
		System.out.println("default constructor");
	}

	public Demo(int a, int b) // 1) differentiate betn instance varibale and argument
	{
		System.out.println("parametirized constructor");
	   this.a=a;
	   this.b=b;
	   name="prachi";
	   
	}
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		addition(this); // 3)pass current obj to another method
	}

	 void addition(Demo d) 
	 {
		System.out.println("sum: "+(d.a+d.b));
		
	}
	 
	 Demo show()
	 {
		 a=a+10;
		 b=b+10;
		 name=name+"salunkhe";
		 
		 return this; // 4) return cuurent object
	 }
	 
	 void printMe()// 5) to differentiate betn local and instance variable
	 {
		 int a=100;
		 System.out.println("local :"+a);
		 System.out.println("instance: "+this.a);
		 this.show();// 6) call one instance method from another
	 }
	 
	 void show1()
	 {
		 System.out.println("hello");
	 }
}

public class ThisDemo {

	public static void main(String[] args)
	{
		Demo d1=new Demo();
		System.out.println(d1.a);
		System.out.println(d1.b);
		System.out.println(d1.name);
		
		Demo d2=new Demo(2,3);
		System.out.println(d2.a);
		System.out.println(d2.b);
		System.out.println(d2.name);
		
		System.out.println("------------------------------------");
		
		Demo d3=new Demo();
		d3.display();
		
		System.out.println("------------------------------------");
		
		Demo d4;
		Demo d5=new Demo();
		 

	}

}
