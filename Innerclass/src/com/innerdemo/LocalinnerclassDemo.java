package com.innerdemo;
class Outer
{
	private static int  data=10;
    void display()
    {
    	class Inner
    	{
    		private int val=90;
    		
    		static void show()
    		{
    			System.out.println(data);
    		}
    		
    		void show1()
    		{
    			System.out.println(val);
    		}
    		
    	}
    	Inner i=new Inner();
    	i.show1();
    	Inner.show();
    }

}
public class LocalinnerclassDemo
{
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Outer s=new  Outer();
        s.display();
	}

}
