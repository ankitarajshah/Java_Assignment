package Assignment.simple.Module2;
//Write a program to print the area and perimeter of a triangle having 
//sides of 3, 4 and 5 units by creating a class named 'Triangle' without any 
//parameter in its constructor.

class Triangle
{
	int a=3,b=4,c=5;
	public Triangle() // constructor w/o parameters ask sir
	{
		
	}
	public void area()
	{
		int s = (a+b+c)/2;
		int x =(int) Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of triangle is : "+x);
	}
	public void perimeter()
	{
		int p = (a+b+c)/2;
		System.out.println("Perimeter of triangle is : "+p);
	}
}


public class TriangleConstructor 
{
	public static void main(String[] args) 
	{
		Triangle t = new Triangle();
		t.area();
		t.perimeter();
	}

}
