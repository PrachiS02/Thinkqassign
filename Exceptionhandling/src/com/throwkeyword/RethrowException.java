package com.throwkeyword;

public class RethrowException
{
    static void method1()
    {
    	try
    	{
    		String s=null;
    		System.out.println(s.length());
    	}
    	catch(NullPointerException e)
    	{
    		System.out.println("In catch block of method1");
            throw e;
    	
    	}
    }
	public static void main(String[] args) {
		try
		{
			method1();
		}
		catch(Exception ex)
		
		{
			System.out.println("In main"+ex);
			//throw ex;
			// it rethrow handled by jvm goes to main block and also in method
		}

	}

}
