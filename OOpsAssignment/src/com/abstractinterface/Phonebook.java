package com.abstractinterface;

public class Phonebook 
{
     private String pname;
     private long pcontact;
     
     Phonebook()
     {
    	 
     }
     
	public Phonebook(String pname, long pcontact)
	{
		super();
		this.pname = pname;
		this.pcontact = pcontact;
	}
    
	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public long getPcontact() {
		return pcontact;
	}

	public void setPcontact(long pcontact) {
		this.pcontact = pcontact;
	}
    
	@Override
	public String toString() {
		return "pname=" + pname + ", pcontact=" + pcontact+" ";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Phonebook pb=new Phonebook("raj",1234456789);
         
         pb.getPname();
         pb.getPcontact();
         System.out.println(pb);
	}

}
