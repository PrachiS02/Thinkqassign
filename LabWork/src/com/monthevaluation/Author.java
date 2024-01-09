package com.monthevaluation;

public class Author 
{
    private int authorid;
    private String authorname;
    
    Author()
    {
    	
    }

	public Author(int authorid, String authorname) {
		super();
		this.authorid = authorid;
		this.authorname = authorname;
	}

	public int getAuthorid() {
		return authorid;
	}

	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	@Override
	public String toString() {
		return "Author [Authorid=" + authorid + ", authorname=" + authorname + "]";
	}
    
}
