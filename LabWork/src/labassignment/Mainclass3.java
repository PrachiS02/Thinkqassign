package labassignment;
class A2
{
	static void methodOne()
	{
		System.out.println("AAA");
	}
   
}
class B2 extends A2
{
	static void methodOne()
	{
		System.out.println("BBB");
	}
}
public class Mainclass3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
           A2 a=new B2();
           a.methodOne();
	}

}
