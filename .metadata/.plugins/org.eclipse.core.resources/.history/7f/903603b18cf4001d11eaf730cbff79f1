package Assignment.simple.Module2;
//Create a class named 'Rectangle' with two data members 'length' and 
//'breadth' and two methods to print the area and perimeter of the 
//rectangle respectively. Its constructor having parameters for length and 
//breadth is used to initialize the length and breadth of the rectangle. Let 
//class 'Square' inherit the 'Rectangle' class with its constructor having a 
//parameter for its side (suppose s) calling the constructor of its parent class 
//as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.

//The super keyword in java is a reference variable that is used to refer to parent class objects
//This is used when we want to call the parent class method. So whenever a parent and child class have the same-named 
//methods then to resolve ambiguity we use the super keyword. This code snippet helps to understand the said usage 
//of the super keyword.
class Rectangle
{
	int length,breadth;
	
	public Rectangle(int a, int b) //parameterized constructor
	{
		length =a;
		breadth=b;
	}
	
	public void area()
	{
		System.out.println("Area is : "+(length*breadth));
	}
	public void perimeter()
	{
		System.out.println("Perimeter is : "+(2*(length+breadth)));
	}
}

class Square extends Rectangle
{
	public Square(int s)
	{
		super(s,s);
	}
	
}


public class Inheritance3RectConstruc 
{
	public static void main(String[] args) 
	{
		Rectangle r =new Rectangle(2,5);
		r.area();
		r.perimeter();
		
		Square s = new Square(4);
		s.area();
		s.perimeter();
	}

}
