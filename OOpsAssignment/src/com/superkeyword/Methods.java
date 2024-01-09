package com.superkeyword;
class Parent1
{
    void display()
    {
        System.out.println("Parent Method");
    }
}
class Child1 extends Parent1
{
    void display()
    {
        super.display();
        System.out.println("Child Method");
    }
}

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c = new Child1();
        c.display();

	}

}
