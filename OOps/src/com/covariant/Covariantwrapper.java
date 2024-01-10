package com.covariant;
class First
{
	Number value;
	
	Object displayValue()
	{
		return value;
	}

}
class Second extends First
{
	Integer myvalue;
	
//	Number displayValue()
//	{
//		myvalue=10;
//		return myvalue;
//	}
//	
	Integer displayValue()
	{
		myvalue=20;
		return myvalue;
	}
}
class Third extends First
{
	Character ch;
	Character displayValue()
	{
		ch='A';
		return ch;
	}
}
public class Covariantwrapper 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       First f=new First();
       f.value=89;
       System.out.println(f.displayValue());
       
       Second s1=new Second();
       System.out.println("Ans is:"+(s1.displayValue()));
       
       Third t1=new Third();
       System.out.println(t1.displayValue());
	}

}
