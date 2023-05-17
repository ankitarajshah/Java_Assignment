package Assignment.simple.Module1;

public class NaturalNum 
{ 
	public static void main(String[] args) 
	{
		System.out.println("Natural numbers using for loop:");
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" " );
		}
		
		System.out.println(" ");
		/* OR using While loop*/
		
		int x=1;
		System.out.println("Natural numbers using while loop:");
		while(x<=10)
		{
			System.out.print(x+" " );
			x++;
		}
		
	}

}
