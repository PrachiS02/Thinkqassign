package labassignment;

public class Test2
{
       protected static final boolean bool=true;
       Test2(final boolean obj)
       {
    	   Boolean bool=new Boolean(obj);
    	   bool=this.bool;
    	   printlt(bool);
       }
       
	private void printlt(Boolean val) 
	{
		System.out.println("value of variable bool is:"+!val);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new  Test2(new Boolean(!true));
	}

}
