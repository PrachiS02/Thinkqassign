package labsession;

public class PrintPattern 
{
    public static void pattern(int rows)
    {
    	int temp=1;
    	for(int i=1;i<=rows;i++)
    	{
    		for(int j=1;j<=rows;j++) 
    		{
    			System.out.print(temp);
				if(temp==1)
    			{
    				temp=0;
    			}
    			else
    			{
    				temp=1;
    			}
    		}
    		System.out.println();
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(5);
	}

}
