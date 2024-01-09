package com.containment;

public class Employee
{
  private int eid;
  private String enmae;
  private int salary;
  private Dept dept;
  private Mydate mydate;
  
  Employee()
  {
	  
  }

    public Employee(int eid, String enmae, int salary, Dept dept, Mydate mydate) {
	super();
	this.eid = eid;
	this.enmae = enmae;
	this.salary = salary;
	this.dept = dept;
	this.mydate = mydate;
    }

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEnmae() {
		return enmae;
	}

	public void setEnmae(String enmae) {
		this.enmae = enmae;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Mydate getMydate() {
		return mydate;
	}

	public void setMydate(Mydate mydate) {
		this.mydate = mydate;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", enmae=" + enmae + ", salary=" + salary + ", dept=" + dept + ", mydate="
				+ mydate + "]";
	}
  
	public static void main(String[] args) 
	{
		Dept d1=new Dept(101,"testing");
		Mydate m1=new Mydate(2,"Jan",2001);
		
		Employee e1=new Employee(1,"Riya",45000,d1,m1);
		System.out.println(e1);
		
		
	}
	
	
}
