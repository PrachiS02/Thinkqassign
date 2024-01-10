package com.statics;

public class StaticDemo 
{
  int x=10;
  static int y=10;
  
  void show()
  {
	  x++;
	  y++;
	  System.out.println("x:"+x);
	  System.out.println("y:"+y);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       StaticDemo d1=new StaticDemo();
       d1.show();
       System.out.println("-------------------");
       
       StaticDemo d2=new StaticDemo();
       d2.show();
	}

}
