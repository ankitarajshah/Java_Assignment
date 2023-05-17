package Assignment.simple.Module2;

//Create a class named 'Shape' with a method to print "This is this is shape". 
//Then create two other classes named 'Rectangle', 'Circle' inheriting the 
//Shape class, both having a method to print "This is rectangular shape" and 
//"This is circular shape" respectively. Create a subclass 'Square' of 
//'Rectangle' having a method to print "Square is a rectangle". Now call the 
//method of 'Shape' and 'Rectangle' class by the object of 'Square' class

class Shape1
{
	public void shape1display()
	{
		System.out.println("This is shape.");
	}
}
class Rectangle1 extends Shape1
{
	public void Rectangle1display()
	{
		System.out.println("This is Rectangular shape.");
	}
}
class Circle extends Shape1
{
	public void Circledisplay()
	{
		System.out.println("This is Circular shape.");
	}
}
class Square1 extends Rectangle1
{
	public void Square1display()
	{
		System.out.println("Square is rectangle shape.");
	}
}
public class ClassShapeInherit
{
	public static void main(String[] args) 
	{
		Square1 s =new Square1();
		s.shape1display();
		s.Rectangle1display();
	
		//s.Square1display();
		
	}
}
