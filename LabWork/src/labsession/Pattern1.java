package labsession;

public class Pattern1 
{
 public static void patterns()
 {
	 for(int i=1;i<=5;i++)
	 {
		 for(int j=1;j<=i;j++)
		 {
			 if(j%2!=0)
			 {
				 System.out.print("i");
			 }
			 else
			 {
				 System.out.print("#");
			 } 
		 }
		 System.out.println();
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patterns();
	}

}
