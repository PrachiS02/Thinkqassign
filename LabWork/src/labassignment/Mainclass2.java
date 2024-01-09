package labassignment;
class A1
{
	public A1(int i)
	{
		System.out.println(myMethod(i));
	}
	
	int myMethod(int i)
	{
		return ++i + --i;
	}
}
class B1 extends A1
{
	public B1(int i,int j)
	{
		super(i*j);
		System.out.println(myMethod(i,j));
	}
    int myMethod(int i,int j)
    {
    	return myMethod(i*j);
    }
}
public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   B1 b=new B1(12,21);
	}

}
