package com.statics;

class Counter
{
	int data;
	static int count=0;
	
	{
		count++;
	}
	Counter()
	{
		data=10;
		//count++;
	}
	Counter(int data)
	{
		//this();
		this.data=data();
		
	}
	private int data() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}

public class HitCounter {


	public static void main(String[] args)
	{
	   Counter c1=new Counter();
	   System.out.println("data:"+c1.data);
	   System.out.println("count:"+Counter.count);
	   
	   
	   Counter c2=new Counter(45);
	   System.out.println("data:"+c2.data);
	   System.out.println("count:"+Counter.count);
	   

	}

}
