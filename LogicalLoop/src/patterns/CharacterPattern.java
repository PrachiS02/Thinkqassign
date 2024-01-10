package patterns;

public class CharacterPattern
{
	public static void main(String[] args) {
    for(int i='A';i<='D';i++)
    {
    	for(int j='A';j<=i;j++)
    	{
    		System.out.print((char)j);
    	}
    	System.out.println();
    }

    System.out.println("-------------------------------------------------");
    for(char i='A';i<='D';i++)
    {
    	for(char j='A';j<=i;j++)
    	{
    		System.out.print(j);
    	}
    	System.out.println();
    }
    
    System.out.println("-------------------------------------------------");
    char ch='G';
    for(char i='G';i<='J';i++)
    {
    	for(char j=ch;j<=i;j++)
    	{
    		System.out.print(ch);
    		ch++;
    	}
    	System.out.println();
    }
    
	}

}
