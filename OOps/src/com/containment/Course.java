package com.containment;

public class Course
{
    private int cid;
    private String cname;
    private int fees;
    
    Course()
    {
    	
    }
    Course(int cid,String cname,int fees)
    {
    	this.cid=cid;
    	this.cname=cname;
    	this.fees=fees;
    }
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	
	public void setCname(String cname) {
		this.cname = cname;
	}

	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", fees=" + fees + "]";
	}
	
}
