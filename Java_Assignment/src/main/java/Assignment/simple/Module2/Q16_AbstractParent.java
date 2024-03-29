package Assignment.simple.Module2;
//Create an abstract class 'Parent' with a method 'message'. It has two 
//subclasses each having a method with the same name 'message' that 
//prints "This is first subclass" and "This is second subclass" respectively. 
//Call the methods 'message' by creating an object for each subclass.

abstract class Parent1
{
	abstract public void message();
}
class Child2 extends Parent1
{

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("This is First subclass");
	}
	
}

class Child3 extends Parent1
{
	public void message()
	{
		System.out.println("This is Second subclass");
	}
}

public class Q16_AbstractParent 
{
	public static void main(String[] args) 
	{
		Parent1 p1 = new Child2();
		p1.message();
		Parent1 p2 =new Child3();
		p2.message();
				
	}
}
