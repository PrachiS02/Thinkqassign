package labsession;

public class DivisibleBy9 
{
    public static  int divisible()
    {
    	int sum=0;
    	for(int i=100;i<=200;i++)
    	{
    		if(i%9==0)
    			System.out.println(i);
    		     sum=sum+i;
    	}
    	return sum;
    }
	public static void main(String[] args)
	{
        divisible();
	}

}
