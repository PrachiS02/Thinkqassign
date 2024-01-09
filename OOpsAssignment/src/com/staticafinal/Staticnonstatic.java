package com.staticafinal;

public class Staticnonstatic 
{
	    int x=10;
	    static int y=20;
	    
	    void instanceMethod()
	    {
	    	System.out.println(x);
	    	System.out.println(y);
	    	staticmethod();
	    }
	    static void staticmethod()
	    {
	    	//System.out.println(x);
	    	System.out.println(y);
	    	Staticnonstatic a1=new Staticnonstatic();
	    	System.out.println(a1.x);
	    	
	    }
	    public static void main(String[] args) {
			// TODO Auto-generated method stub
			staticmethod();
		}
}
