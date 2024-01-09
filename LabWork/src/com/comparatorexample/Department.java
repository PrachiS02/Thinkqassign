package com.comparatorexample;

public class Department 
{
   private int depid;
   private String dname;
   private String dloc;

   public Department() {
	super();
   }

    public Department(int depid, String dname, String dloc) {
	super();
	this.depid = depid;
	this.dname = dname;
	this.dloc = dloc;
   }

	public int getDepid() {
		return depid;
	}

	public void setDepid(int depid) {
		this.depid = depid;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDloc() {
		return dloc;
	}

	public void setDloc(String dloc) {
		this.dloc = dloc;
	}

	@Override
	public String toString() {
		return "Department [depid=" + depid + ", dname=" + dname + ", dloc=" + dloc + "]";
	}
   
    
   
}
