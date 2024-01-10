package com.set;

import java.util.Comparator;

public class NameEmployeeComparator implements Comparator<Employeetree> 
{

	@Override
	public int compare(Employeetree o1, Employeetree o2) {
		return (o1.getId()-o2.getId());
		
	}

}
