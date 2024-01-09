package com.staticafinal;
 class A
 {
    private void say(int number)
    {
        System.out.print("A:"+number);

    }
}

 class B extends A
 {
    public void say(int number)
    {
        System.out.print("Over:"+number);
    }
}

public class Privatemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 A a=new B();
	        //a.say(12);

	}

}
