package labassignment;
class Person
{
	public int number;
}
public class Test1
{
      public  void doThis(int i,Person p)
		{
			i = 5;
			p.number = 8;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x=0;
        Person p=new Person();
        new Test1().doThis(x,p);
        System.out.println(x+" "+p.number);
	}

}
