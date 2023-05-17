package Assignment.simple.Module1;

public class FiboDemo 
{
	public static void main(String[] args) 
	{
		/* 1 2 3 5 8 13 21 34*/
		
		int n1=0,
			n2=1,
			n3=0, 
			i,
			count=10;
		System.out.print(n1+" "+n2+" ");  //printing 0 and 1
		
		for(i=2;i<=count;i++)
		{
			n3=n1+n2;
			System.out.print(n3 +" ");
			n1=n2;
			n2=n3;
		}
	}

}
