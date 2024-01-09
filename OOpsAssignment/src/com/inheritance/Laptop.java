package com.inheritance;

public class Laptop
{
   private int noOfUSBPort;
   private int processorspeed;
   
   Laptop()
   {
	   
   }
   
	public Laptop(int noOfUSBPort, int processorspeed)
	{
	super();
	this.noOfUSBPort = noOfUSBPort;
	this.processorspeed = processorspeed;
    }

	public int getNoOfUSBPort() {
		return noOfUSBPort;
	}

	public void setNoOfUSBPort(int noOfUSBPort) {
		this.noOfUSBPort = noOfUSBPort;
	}

	public int getProcessorspeed() {
		return processorspeed;
	}

	public void setProcessorspeed(int processorspeed) {
		this.processorspeed = processorspeed;
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Laptop l=new Laptop();
      l.setNoOfUSBPort(2);
      l.setProcessorspeed(2000);
      System.out.println(l.getNoOfUSBPort());
      System.out.println(l.getProcessorspeed());;
	}

}
