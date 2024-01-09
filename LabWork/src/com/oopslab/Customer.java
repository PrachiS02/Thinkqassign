package com.oopslab;

public class Customer 
{
   private int cid;
   private String cname;
   private String cemail;
   private int ccontact;
   private String cpass;
   
   Customer()
   {
	   
   }
    Customer(int cid,String cname,String cemail,int ccontact,String cpass)
    {
    	this.cid=cid;
    	this.cname=cname;
    	this.cemail=cemail;
    	this.ccontact=ccontact;
    	this.cpass=cpass;
    	
    }
   
    public void setcid(int cid)
    {
    	this.cid=cid;
    }
    public int getcid()
    {
    	return cid;
    }
    public void setcname(String cname)
    {
    	this.cname=cname;
    }
    public String getcname()
    {
    	return cname;
    }
    public void setcemail(String cemail)
    {
    	this.cemail=cemail;
    }
    public String getcemail()
    {
    	return cemail;
    }
    public void setccontact(int ccontact)
    {
    	this.ccontact=ccontact;
    }
    public int getccontact()
    {
    	return ccontact;
    }
    public void setcpass(String cpass)
    {
    	this.cpass=cpass;
    }
    public String getcpass()
    {
    	return cpass;
    	
    }
    public String toString()
	{
		return cid+" "+cname+" "+cemail+" "+ccontact+" "+cpass+" ";
	}

    
    
    
    
}
