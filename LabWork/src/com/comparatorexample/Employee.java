package com.comparatorexample;

public class Employee implements Comparable<Employee>
{
  private int eid;
  private String ename;
  private double esal;
  private Department edept;

  public Employee() {
	super();
  }

   public Employee(int eid, String ename, double esal, Department edept) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.esal = esal;
	this.edept = edept;
   }

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	public Department getEdept() {
		return edept;
	}

	public void setEdept(Department edept) {
		this.edept = edept;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", edept=" + edept + "]";
	}

	@Override
	public int compareTo(Employee e1) {
		
		//return (this.eid-e1.eid);
		//return (this.ename.compareTo(e1.ename));
		
//     	if(this.esal==e1.esal)
//			return 0;
//		else if(this.esal<e1.esal)
//			return -1;
//		else 
//			return 1;

		
		//return this.getEdept().getDname().compareTo(e1.getEdept().getDname());
			
		if(this.getEdept().getDname().compareTo(e1.getEdept().getDname())==0)
		{
			if(this.getEsal()==e1.getEsal())
				return 0;
			else if(this.getEsal()>e1.getEsal())
				return 1;
			else
				return -1;
		}
		else if(this.getEdept().getDname().compareTo(e1.getEdept().getDname())>0)
		
			return -1;
		else 
			return 1;
			
		
		
		
			
	}
   
	
  
  
  
  
  
  
}
