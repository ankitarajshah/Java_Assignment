package Assignment.simple.Module1;

public class ForLoop 
{
	public static void main(String[] args)
	{
		/* p1
		0000
		1111
		2222
		3333*/
		for(int i=0;i<=3;i++)//row
		{
			for(int j=0;j<=3;j++)//col
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		/* p2
		12345
		12345
		12345
		12345
		12345*/
		for(int i=1;i<=5;i++)//row
		{
			for(int j=1;j<=5;j++)//col
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		/*p3
		1
		22
		333
		4444
		55555*/
		for(int i=1;i<=5;i++)//row
		{
			for(int j=i;j>=1;j--)//col
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		/*p4
		1
		21
		321
		4321
		54321*/
		for(int i=1;i<=5;i++)//row
		{
			for(int j=i;j>=1;j--)//col
			{
				System.out.print(j);
			}
			System.out.println();
		}
		/*54321
		54321
		54321
		54321
		54321*/
		for(int i=5;i>=1;i--)//row
		{
			for(int j=5;j>=1;j--)//col
			{
				System.out.print(j);
			}
			System.out.println();
		}
		/*55555
		44444
		33333
		22222
		11111
		 */
		for(int i=5;i>=1;i--)//row
		{
			for(int j=5;j>=1;j--)//col
			{
				System.out.print(i);
			}
			System.out.println();
		}
		/*5
		5
		44
		333
		2222
		11111*/
		for(int i=5;i>=1;i--)//row
		{
			for(int j=5;j>=i;j--)//col
			{
				System.out.print(i);
			}
			System.out.println();
		}
		/*5
		54
		543
		5432
		54321*/
		for(int i=5;i>=1;i--)//row
		{
			for(int j=5;j>=i;j--)//col
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		/*
		*
		* *
		* * *
		* * * *
		* * * * *
		*/
		for(int i=5;i>=1;i--)//row
		{
			for(int j=5;j>=i;j--)//col
			{
				System.out.print("*");
			}
			System.out.println();
		}
		/* OR
		*
		* *
		* * *
		* * * *
		* * * * *
		*/
		for(int i=1;i<=5;i++)//row
		{
			for(int j=1;j<=i;j++)//col
			{
				System.out.print("*");
			}
			System.out.println();
		}
		/* OR
		*
		* *
		* * *
		* * * *
		* * * * *
		*/
		for(int i=1;i<=5;i++)//row
		{
			for(int j=i;j>=1;j--)//col
			{
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		* * * * *
		* * * *
		* * * 
		* *
		*
		*/
		for(int i=5;i>=1;i--)//row
		{
			for(int j=1;j<=i;j++)//col
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		55555
		4444
		333
		22
		1
		*/
		for(int i=5;i>=1;i--)//row
		{
			for(int j=1;j<=i;j++)//col
			{
				System.out.print(i);
			}
			System.out.println();
		}
		/*
		1 2 3 4 5
		1 2 3 4 
		1 2 3
		1 2
		1
		*/
		for(int i=5;i>=1;i--)//row
		{
			for(int j=1;j<=i;j++)//col
			{
				System.out.print(j);
			}
			System.out.println();
		}
		/*
		54321
		4321
		321
		21
		1
		 */
		for(int i=5;i>=1;i--)//row
		{
			for(int j=i;j>=1;j--)//col
			{
				System.out.print(j);
			}
			System.out.println();
		}
		/* need to ask
		54321
		5432
		543
		54
		5
		*/
		for(int i=5;i>=1;i--)//row
		{
			for(int j=5;j>=i;j--)//col
			{
				System.out.print(j);
			}
			System.out.println();
		}
			
	}
}
