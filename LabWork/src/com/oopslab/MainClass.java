package com.oopslab;

class ClassOne
{
	void method(String s1)
	{
	   method(s1,s1+s1);
	  	
	}
	
	void method(String s1,String s2)
	{
		method(s1,s2,s1+s2);
	}
	
	void method(String s1,String s2,String s3)
	{
		System.out.println(s1+s2+s3);
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ClassOne one =new ClassOne();
         one.method("JAVA");
	}

}
