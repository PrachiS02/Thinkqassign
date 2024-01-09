package com.constructor;

 class Subcourse
{
  private int subcourseid;
  private String subcoursename;
  
  Subcourse()
  {
	  System.out.println("default subcourse constructor");
  }
  public Subcourse(int subcourseid,String subcoursename)
  {
	  this.subcourseid=subcourseid;
	  this.subcoursename=subcoursename;
  }
  public void setsubcourseid(int subcourseid)
  {
	  this.subcourseid=subcourseid;
  }
  public int getsubcourseid()
  {
	  return subcourseid;
  }
  public void setsubcoursename(String subcoursename)
  {
	  this.subcoursename=subcoursename;
  }
  public String getsubcoursename()
  {
	  return subcoursename;
  }
  
  public String toString()
	{
	  return subcourseid+" "+subcoursename+"";
	}
/*
  public static void main (String args[])
  {
	  Subcourse s1=new Subcourse();
	  s1.setsubcourseid(101);
	  s1.setsubcoursename("java");
	 System.out.println(s1.getsubcourseid());
	 System.out.println( s1.getsubcoursename());
	  }*/
}
