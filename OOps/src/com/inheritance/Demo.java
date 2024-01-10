package com.inheritance;

public class Demo {
public static void main(String[] args) {
		
		AccessModifiersProtected obj= new AccessModifiersProtected();
		
		//obj.a=90; //private is not accessible
		obj.b=89;
		obj.c=67;
		obj.d=71;
		
		//obj.show();
		obj.display();
		obj.printMe();
		obj.display1();
		
	}

}
