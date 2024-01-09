package labsession;

public class SumNatural 
{
     public static int naturalsum(int n)
     {
		 int sum=0;
		 for(int i=1;i<=n;i++)
		 {
			 sum=sum+i;
		 }
    	 return sum;
    	 
     }
	public static void main(String[] args) 
	{
		System.out.println("print from 10 to 1 : "+naturalsum(10));

	}

}
