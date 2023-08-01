
package Assignment.simple.Module2;
//Create a class to print the area of a square and a rectangle. The class has 
//two methods with the same name but different number of parameters. 
//The method for printing area of a rectangle has two parameters which are 
//length and breadth respectively while the other method for printing area 
//of square has one parameter which is side of square.

//method overloading- method name same with different parameters

class Area
{
	public void calulate(int a,int b)
	{
		System.out.println("Area of rectangle :"+(a*b));
	}
	public void calulate(int a)
	{
		System.out.println("Area of square :"+(a*a));
	}
}


public class Q10_AreaSqrect 
{
	public static void main(String[] args) 
	{
		Area a = new Area();
		a.calulate(12, 10);
		a.calulate(5);
		
	}
}
