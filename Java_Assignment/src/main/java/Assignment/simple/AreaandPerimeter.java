package Assignment.simple;

import java.util.Scanner;

public class AreaandPerimeter 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		//Area and Perimeter/circumferance of circle
		
		System.out.println("Enter radius of circle: ");
		float  r =sc.nextFloat();
		System.out.println("Area of circle: "+(3.14*r*r)); // pi*r
		System.out.println("Perimeter of circle:"+(2*3.14*r));//2*pi*r
		
		//Area and Perimeter of rectangle
		System.out.println("Enter length and breadth of rectangle :");
		int l= sc.nextInt();
		int b= sc.nextInt();
		System.out.println("Area of rectangle is : "+(l*b));
		System.out.println("Perimeter of rectangle is : "+(2*(l+b)));
		
						
	}

}
