package com.wrapperclasses;

public class Autowiden {

	public void showNum(Number i)
	{
		System.out.println("shownum:"+i);
	}
	public void showNum(Long i)
	{
		System.out.println("shownum:"+i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=50;
        Autowiden at=new  Autowiden();
        at.showNum(i);
        
	}

}
