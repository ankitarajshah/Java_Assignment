//Q23, 24 
//Take two numbers from the user and perform the division operation and 
//handle Arithmetic Exception. O/PEnter two numbers: 10 0
//Exception in thread main java.lang.ArithmeticException:/ by zero
package Assignment.simple.Module2;

import java.util.Scanner;

public class Q23_Try_Catch
	{
		public static void main(String[] args) 
		{
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter 1st number :");
				int n1=sc.nextInt();
				System.out.println("Enter 2nd number :");
				int n2=sc.nextInt();
				int op= n1/n2;
				
				System.out.println("Division is :"+op);
				System.out.println("Program is complete");
				
			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println(e);
				
			}
			System.out.println("Program executed..");
		}

	}