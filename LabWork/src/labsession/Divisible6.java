package labsession;

public class Divisible6
{
	public static int divisible()
	{
		int count=0;
		for(int i=1;i<=100;i++)
		{
			if(i%6==0)
				System.out.println(i);
			    count++;
		}
		return count;
	
	}

	public static void main(String[] args) 
	{
		System.out.println("count: "+divisible());
	}

}
