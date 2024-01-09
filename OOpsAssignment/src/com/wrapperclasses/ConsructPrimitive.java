package com.wrapperclasses;

public class ConsructPrimitive
{
    void Byte(byte i)
    {
    	System.out.println(i);
    }
    void Short(short b)
    {
    	System.out.println(b);
    }
    void Long(long b)
    {
    	System.out.println(b);
    }
    void Integer(int b)
    {
    	System.out.println(b);
    }
    void Float(float b)
    {
    	System.out.println(b);
    }
    void Double(double b)
    {
    	System.out.println(b);
    }
    void Character(char ch)
    {
    	System.out.println("character:"+ch);
    }
    void Boolean(boolean b)
    {
    	System.out.println(b);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsructPrimitive cp=new ConsructPrimitive();
		cp.Boolean(false);
		//cp.Byte(8);
		cp.Character('a');
		cp.Double(2.0d);
		cp.Float(25.68f);
		cp.Integer(5);
		cp.Long(456789);
		//cp.Short(67);
	}

}
