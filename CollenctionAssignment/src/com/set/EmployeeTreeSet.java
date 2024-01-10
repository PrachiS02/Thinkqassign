package com.set;

import java.util.TreeSet;


public class EmployeeTreeSet {

	public static void main(String[] args) {
    TreeSet<Employeetree> ts=new TreeSet<>();
    ts.add(new Employeetree(1,"prachi",90000));
	ts.add(new Employeetree(2,"pranali",76000));
	ts.add(new Employeetree(3,"pranay",33000));
	ts.add(new Employeetree(1,"prachi",67000));
	ts.add(new Employeetree(5,"reetu",50000));
	
	for(Employeetree e:ts)
	{
		System.out.println(e);
	}
	}

}
