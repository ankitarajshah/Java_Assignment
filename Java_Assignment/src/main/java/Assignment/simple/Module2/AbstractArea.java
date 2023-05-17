package Assignment.simple.Module2;

import java.util.Scanner;

//We have to calculate the area of a rectangle, a square and a circle. Create 
//an abstract class 'Shape' with three abstract methods namely 
//'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' 
//taking one parameter each. The parameters of 'RectangleArea' are its 
//length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' 
//is its radius. Now create another class 'Area' containing all the three 
//methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the 
//area of rectangle, square and circle respectively. Create an object of class 
//'Area' and call all the three methods.
abstract class Shape
{
	abstract void RectangleArea(double l,double b);
	abstract void SquareArea(double s);
	abstract void CircleArea(double r);
}

class Areaa extends Shape
{
	@Override
	public void RectangleArea(double l,double b)
	{
		double area= (l*b);
		System.out.println("RectangleArea is:"+area);
	}
	@Override
	public void SquareArea(double s)
	{
		double area= (s*s);
		System.out.println("SquareArea is:"+area);
	}
	@Override
	public void CircleArea(double r)
	{
		double area =(2*3.14*r*r);
		System.out.println("CircleArea is:"+area);
	}
}
public class AbstractArea 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		Areaa a =new Areaa();
//		a.RectangleArea(5, 5);
//		a.SquareArea(5);
//		a.CircleArea(1);
		System.out.println("Enter length of rectangle :");
		double l=sc.nextDouble();
		System.out.println("Enter breadth of rectangle :");
		double b=sc.nextDouble();
		a.RectangleArea(l, b);
		
		System.out.println("Enter sides of square :");
		double s=sc.nextDouble();
		a.SquareArea(s);
		
		System.out.println("Enter radius of circle :");
		double r=sc.nextDouble();
		a.CircleArea(r);
	}
}
