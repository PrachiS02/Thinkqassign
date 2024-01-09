package com.containment;

public class Person
{
   private String name;
   private String gender;
   private int age;
   private Address address;
   
   Person()
   {
	   
   }

   Person(String name, String gender, int age, Address address) 
   {
	
	this.name = name;
	this.gender = gender;
	this.age = age;
	this.address = address;
}

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getGender() {
	return gender;
    }

    public void setGender(String gender) {
	this.gender = gender;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

     public Address getAddress() {
	return address;
    }


    public String toString() {
	return "Person [name=" + name + ", gender=" + gender + ", age=" + age + ", address=" + address + "]";
     }

     public void setAddress(Address address) {
	this.address = address;
       }
   
     public static void main(String[] args) {
 		// TODO Auto-generated method stub

   	  Address ad1=new Address("satara","maharashtra","India");
   	 //Address ad2=new Address("pune","maharashtra","India");
   	  
   	  Person p1=new Person("sakshi","female",25,ad1);
   	  System.out.println(p1);
    	  
      
}}
