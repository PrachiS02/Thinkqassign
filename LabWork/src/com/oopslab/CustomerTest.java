package com.oopslab;

public class CustomerTest {

	public static void main(String[] args) 
	{
	    Customer c1=new Customer();
	    c1.setcid(10);
	    c1.setcname("prachi");
	    c1.setcemail("abc@gmail.com");
	    c1.setccontact(1234567892);
	    c1.setcpass("pass@123");
	    
	    System.out.println(c1.getcid());
	    System.out.println(c1.getcname());
	    System.out.println(c1.getcemail());
	    System.out.println(c1.getccontact());
	    System.out.println(c1.getcpass());
	    
	    

	}

}
