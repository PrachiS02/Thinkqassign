package com.containment;

public class EmployeeTest 
{
    static void noofempeachdept(Employee e[],Department dep[])
    {
    	int count;
    	for(Department d:dep)
    	{
    		count=0;
    		for(Employee x:e)
    		{
               if(x.getDept().equals(d))
               {
            	   count++;
               }
    		}
    		System.out.println(d+"->"+count);
    	}
    }
    static void infocountstempperdept(Employee e[],Department dep[])
	{
    	for(Department d:dep)
    	{
             System.out.println(d);
    		for(Employee x:e)
    		{
               if(x.getDept().equals(d))
               {
            	   System.out.println(x.getEid()+" "+x.getEname()+" "+x.getSal());
               }
    		}
    		
    	}
	}
	public static void main(String[] args)
	{
		Department d[]=new Department[3];
		d[0]=new Department(1,"IT");
		d[1]=new Department(2,"Sales");
		d[2]=new Department(3,"HR");
		
		Employee e[]=new Employee[8];
		e[0]=new Employee(101,"Raj",45000,d[0]);
		e[1]=new Employee(102,"Sakshi",67000,d[0]);
		e[2]=new Employee(103,"Monika",40000,d[0]);
		e[3]=new Employee(104,"Pooja",42000,d[1]);
		e[4]=new Employee(105,"Rahul",65000,d[1]);
		e[5]=new Employee(106,"Rajat",35000,d[1]);
		e[6]=new Employee(107,"Raju",49000,d[2]);
		e[7]=new Employee(108,"Reetu",20000,d[2]);
		
		for(Employee x:e)
		{
			System.out.println(x);
		}
		
		System.out.println("--------------------------");
		//noofempeachdept(e,d);
		infocountstempperdept(e,d);
	}

}
