package com.containment;

public class Company {

	public static void main(String[] args) {
		
      Department d1=new Department(101,"Technical");
      Department d2=new Department(102,"Testing");
      
      Employee e1=new Employee(1,"prachi",d1);
      Employee e2=new Employee(2,"pratik",d2);
      
      System.out.println(e1);
      System.out.println(e2);
	}

}
