package Assignment.simple.Module2;
//Create a class with a method that prints "This is a parent class" and its 
//subclass with another method that prints "This is child class". Now, create 
//an object for each of the class and call 1 - method of parent class by object 
//of parent class 2 - method of child class by object of child class 3 - method 
//of parent class by object of child class


class Parent  //superclass
{
	public void print()
	{
		System.out.println("This is Parent class");
	}
}
class Child extends Parent //subclass
{ 
	public void print1()
	{
		System.out.println("This is Child class");	
	}
}
class SubChild extends Child
{
	public void print2()
	{
		System.out.println("This is Subchild");
	}
	
}


public class Inheritance1 
{
	public static void main(String[] args) 
	{
		Parent p =new Parent();
		p.print();
		Child c =new Child();
		c.print1();
		SubChild s = new SubChild();
		s.print2();
		
//		 Now, create 
//		 an object for each of the class and call 1 - method of parent class by object 
//		 of parent class 2 - method of child class by object of child class 3 - method 
//		 of parent class by object of child class
	
		s.print();
		s.print1();
		s.print2();
	}

}
