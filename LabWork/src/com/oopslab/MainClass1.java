package com.oopslab;

public class MainClass1
{
    double overloadedMethod(double d)
    {
    	return d*=d;
    }
    int overloadedMethod(int i)
    {
    	return overloadedMethod(i*=i);
    }
    float overloadedMethod(float f)
    {
    	return overloadedMethod(f*=f);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MainClass1 main=new MainClass1();
    System.out.println(main.overloadedMethod(100));
	}

}
