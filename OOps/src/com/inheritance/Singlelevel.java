package com.inheritance;
class Employee
{
	private int id;
	private String name;
	private float salary;
	//protectd float salary;
	
	public Employee()
	{
		System.out.println("In employee default constructor");
	}
	
	public Employee(int id,String name,float salary)
	{
		System.out.println("In employee param constructor");
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

  class Manager extends Employee
   {
	
     private float exp;
     private String role;

     Manager()
     {
    	 super();
    	 System.out.println("In manager default constructor");
     }
     

	public Manager(int id, String name, float salary, float exp, String role)
	{
		super(id, name, salary);
		this.exp = exp;
		this.role = role;
	}


	public float getExp() {
		return exp;
	}

	public void setExp(float exp) {
		this.exp = exp;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
	public String toString() {
		//return super.toString()+"Manager [exp=" + exp + ", role=" + role + "]";
		return "Manager [exp=" + exp + ", role=" + role + "]";
	}
     
	
  }
public class Singlelevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee e1=new Employee(1,"prachi",25000);
        System.out.println(e1);
        
        Manager m1=new Manager(1,"abc",85000,2,"Developer");
        System.out.println(m1);
	}

}
