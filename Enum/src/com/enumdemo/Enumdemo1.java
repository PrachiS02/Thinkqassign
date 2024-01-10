package com.enumdemo;
class DirectionC
{
	public static final String NORTH="NORTH";
	public static final String SOUTH="SOUTH";
	public static final String EAST="EAST";
	public static final String WEST="WEST";
	
}
public class Enumdemo1 
{
     public enum Direction{NORTH,EAST,WEST,SOUTH};
	public static void main(String[] args) {
		
         
         
          
          Direction d2=Direction.NORTH;
          Direction d1=Direction.NORTH;
          System.out.println(d1);
          
          if(d1==d2)
          {
        	  System.out.println("Equals");
          }
          
          if(d1.equals(d2))
          {
        	  System.out.println("Equal");
          }
          
          System.out.println("------------------");
          //iterate enum
          
          for(Direction d:Direction.values())
          {
        	  System.out.println(d);
          }
         
          System.out.println(Direction.valueOf("NORTH"));
          
          System.out.println(Direction.SOUTH.ordinal());
          
	}

}
