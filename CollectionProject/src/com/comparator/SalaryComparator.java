package com.comparator;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee e1, Employee e2) {
	
		if(e1.getEsal()==e2.getEsal())
			return 0;
		else if(e1.getEsal()<e2.getEsal())
			return -1;
		else
			return 1;
			
	}

}
