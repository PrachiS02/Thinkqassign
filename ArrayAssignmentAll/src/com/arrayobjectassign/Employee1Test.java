package com.arrayobjectassign;

public class Employee1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee1 e[]=new Employee1[8];
       e[0]=new Employee1(101,"Arohi");
       e[1]=new Employee1(101,"sakshi");
       e[2]=new Employee1(102,"Tanmay");
       e[3]=new Employee1(103,"Arohi");
       e[4]=new Employee1(104,"Akash");
       e[5]=new Employee1(105,"Ovi");
       e[6]=new Employee1(106,"Ajay");
       e[7]=new Employee1(107,"Sai");
       
       for(Employee1 x:e)
       {
    	   System.out.println(x);
       }
       
	}

}
