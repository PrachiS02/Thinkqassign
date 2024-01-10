package com.enumdemo;
 enum Seasons{WINTER,SUMMER,SPRING,MONSOON};
public class Enumoutsideclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Seasons s=Seasons.SUMMER;
    
    switch(s)
    {
    case WINTER: System.out.println("woolen clothes");
                 break;
    case SPRING: System.out.println("full sleeves clothes");
                 break;
    case SUMMER: System.out.println("Cotton clothes");
                  break;
                  
    case MONSOON: System.out.println("Carry umbrella");
                  break;
     default: System.out.println("error........");
    }
    
	}

}
