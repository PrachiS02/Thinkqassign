package com.containment;

public class Department1 {
	private int did;
	   private String dname;
	   
	   Department1()
	   {
		   
	   }
	   Department1(int did,String dname)
	   {
		   this.did=did;
		   this.dname=dname;
	   }
	   
	   public void setDname(String Dname)
	   {
		   this.dname=dname;   
	   }
	   public String  getDname()
	   {
		   return dname;   
	   }
	 
	   public int  getDid()
	   {
		   return did;   
	   }
	   public void setDid(int did)
	   {
		   this.did=did;   
	   }

		public String toString() {
			return "Department [did=" + did + ", dname=" + dname + "]";
		}
	   
}
