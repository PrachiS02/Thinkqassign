package com.covariant;
class Person
{
	 int id;
	String name;
	
	
	public Person() 
	{
		super();
	}


	public Person(int id, String name)
	{
		super();
		this.id = id;
		this.name = name;
	}
	Person showdetails()
	{
		name=name+"TQ";
		return this;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}	

}
class Employee extends Person
{
	float salary;
	
	Employee()
	{
		
	}

	public Employee(int id, String name, float salary) 
	{
		super(id, name);
		this.salary = salary;
	}
    Person showdetails()
    {
    	name=name+"Thinkq";
    	salary=salary+1000;
		return this;
    }
    void showSalary()
    {
    	System.out.println("Salary:"+salary);
    }
	@Override
	public String toString() {
		return "Employee [salary=" + salary + "" +super.toString();
	}
	
	
}
public class Covariantdemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        Person p;
        Employee e;
        
        Person p1=new Person(1,"abc");
         p=p1.showdetails();
         System.out.println(p);
        
        Employee e1=new Employee(2,"xyz",45000);
        p=e1.showdetails();
        System.out.println(p);
        
	}

}
