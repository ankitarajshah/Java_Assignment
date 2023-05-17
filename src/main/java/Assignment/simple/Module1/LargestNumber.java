package Assignment.simple.Module1;

import java.util.Scanner;

public class LargestNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers:");
		System.out.print("Enter First number :");
		int n1=sc.nextInt();
		System.out.print("Enter Second number :");
		int n2=sc.nextInt();
		System.out.print("Enter Third number :");
		int n3=sc.nextInt();
		//System.out.print("Three numbers from user are: "+n1);
		if(n1>n2 && n1>n3)
		{
			System.out.println("Largest number is n1 :"+n1);
		}
		else if(n2>n3 && n2>n1)
		{
			System.out.println("Largest number is n2 :"+n2);
		}
		else if(n3>n1 && n3>n2)
		{
			System.out.println("Largest number is n3 :"+n3);
		}
		else
		{
			System.out.println("All numbers are same");
		}
	/*OR*/	
		int largest;
		largest=n3 > (n1>n2 ? n1 : n2) ? n3 :((n1>n2) ? n1 : n2);
		System.out.println("Largest number is "+largest);
	}
}
