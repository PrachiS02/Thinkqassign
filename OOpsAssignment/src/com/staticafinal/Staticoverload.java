package com.staticafinal;

public class Staticoverload 
{
  public static void display()
  {
	  System.out.println("static method called");
  }
  public static void display(int x)
  {
	  System.out.println("overloaded static method called");
  }
  public static void main(String[] args)
  {
	  Staticoverload .display();
	  Staticoverload .display(5);
 }
}
