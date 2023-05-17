package Assignment.simple.Module2;

import java.util.Scanner;

//Write a program to print the factorial of a number by defining a method 
//named 'Factorial'. Factorial of any number n is represented by n! and is 
//equal to 1*2*3*. *(n-1) *n. E.g.-
//4! = 1*2*3*4 = 24
//3! = 3*2*1 = 6
//2! = 2*1 = 2
//Also, 1! = 1
//0! = 0


public class FactorialNum 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number for factorial:");
		int num=sc.nextInt();
		factorial(num);
	}
	public static void factorial(int num) {
		// TODO Auto-generated method stub
		int i,f=1;
		for(i=1;i<=num;i++)
		{
			f=f*i;
		}
		System.out.print("Factorial of the "+num+" is " +f); 
	}

}
