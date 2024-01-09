package labassignment;
class X
{
	int method(int i)
	{
		return i*=i;
	}
}
class Y extends X
{
	
    double method(double d)
    {
    	return d/=d;
    }
}
class Z extends Y
{
	
    float method(float f)
    {
    	return f*=f;
    }
}
public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Z z=new Z();
       
       System.out.println(z.method(21.12));
       
	}

}
