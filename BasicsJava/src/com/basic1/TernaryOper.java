package com.basic1;

public class TernaryOper {

	public static void main(String[] args) 
	{
		
       int age=13;
       
       if(age>=18)
    	   System.out.println("vote");
       else
    	   System.out.println(" can not vote");
       
       boolean status=age>=18?true:false;
       System.out.println(status);
       
       System.out.println(age>=18?"can vote":"can not vote");
       
       int num=34;
       System.out.println(num%2==0?" even":"odd");
	}

}
