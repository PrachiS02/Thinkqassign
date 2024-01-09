package labassignment;

public class PrimeAll
{
	public static void checkprime(int num)
	{
		boolean status=true;
		
		if(num==0 || num==1)
			status=false;
		else
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
				status=false;
				break;
				}
			}
		}
		if(status)
			System.out.println(num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         for(int i=1;i<=100;i++)
        	 checkprime(i) ;
	}

}
