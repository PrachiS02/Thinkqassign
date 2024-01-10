package com.covariant;
//allowing a subclss method to override a super class method
//return a subtype of superclass method return type
class MyPerson
{
	 int id;
	String name;
	
	
	public MyPerson() 
	{
		super();
	}

 
	public MyPerson(int id, String name)
	{
		super();
		this.id = id;
		this.name = name;
	}
	MyPerson showdetails()
	{
		name=name+"TQ";
		return this;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}	

}
class MyEmployee extends MyPerson
{
	float salary;
	
	MyEmployee()
	{
		
	}

	public MyEmployee(int id, String name, float salary) 
	{
		super(id, name);
		this.salary = salary;
	}
    MyPerson showdetails()
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
public class Covariant {

	public static void main(String[] args) 
	{
		MyPerson m;
		MyEmployee e;
		
		MyPerson m1=new MyPerson();
		m=m1.showdetails();
		System.out.println(m);
		
	
		MyEmployee e1=new MyEmployee(101,"pranay",89000);
		m=e1.showdetails();
		System.out.println(e1);// calls overriden tostring

		//p.showSalary();//extra method of my employee so cant be called from person p
		
		e=(MyEmployee) e1.showdetails();
		System.out.println(e);
		e.showSalary();
		
		}

}
