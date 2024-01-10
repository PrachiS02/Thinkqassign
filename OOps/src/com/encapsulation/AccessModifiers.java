package com.encapsulation;

public class AccessModifiers 
{
    private int a;
    int b;
    public int c;
    
    private void show()
    {
    	System.out.println("private method");
    }
    void display()
    {
    	System.out.println("default method");
    }
    public void printMe()
    {
    	System.out.println("public method");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AccessModifiers a1=new AccessModifiers();
        
        a1.a=90;
        a1.b=95;
        a1.c=80;
        
        System.out.println(a1.a);
        System.out.println(a1.b);
        System.out.println(a1.c);
        
        a1.show();
        a1.display();
        a1.printMe();
	}

}
