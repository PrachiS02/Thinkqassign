package app.mob;

import app.prog.Application;
import app.prog.Developer;

public class Mobileapplication extends Application
{
    private String name;
    private double space;
	 Mobileapplication() 
	{
	
	}
	public Mobileapplication(double version, String technology, String name, double space,Developer developer) {
		super(version, technology,developer);
		this.name = name;
		this.space = space;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSpace() {
		return space;
	}
	public void setSpace(double space) {
		this.space = space;
	}
	@Override
	public String toString() {
		return "Mobileapplication [name=" + name + ", space=" + space + ""+super.toString();
	}
    
    
}
