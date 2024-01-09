package com.inheritance;
class IPLteam
{
	void play()
	{
		System.out.println("this IPL family");
	}
}
class CSK extends IPLteam
{
	void play()
	{
		super.play();
		System.out.println("this is CSK team");
	}
}
class RCB extends IPLteam
{
	void play()
	{
		System.out.println("this is RCB team");
	}

}
public class Iplmatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSK cs=new CSK();
		cs.play();
       RCB rb=new RCB();
       rb.play();
       
	}

}
