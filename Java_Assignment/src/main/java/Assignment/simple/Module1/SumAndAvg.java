package Assignment.simple.Module1;

import java.util.Scanner;

public class SumAndAvg
{
	public static void main(String[] args) 
	{
		int sum=0,avg=0,n=0;
		
		System.out.println("Enter any 5 numbers");
		
		for(int i=1;i<=5;i++)
		{
			Scanner sc =new Scanner(System.in);
			n= sc.nextInt();
			sum=sum+n;
		}
		System.out.println("The sum of numbers is : "+sum);
		avg=sum/5;
		System.out.println("The average of numbers is: "+avg);
		
		
		
		
	}
}
