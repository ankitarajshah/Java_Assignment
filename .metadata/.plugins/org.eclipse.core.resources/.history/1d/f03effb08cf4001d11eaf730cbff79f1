package Assignment.simple.Module2;
//We have to calculate the percentage of marks obtained in three subjects 
//(each out of 100) by student A and in four subjects (each out of 100) by 
//student B. Create an abstract class 'Marks' with an abstract method 
//'getPercentage'. It is inherited by two other classes 'A' and 'B' each having 
//a method with the same name which returns the percentage of the 
//students. The constructor of student A takes the marks in three subjects 
//as its parameters and the marks in four subjects as its parameters for 
//student B. Create an object for each of the two classes and print the 
//percentage of marks for both the students.

abstract class Marks
{
	abstract public void getPercentage();
}
class A extends Marks
{
	A() //constructor
	{
		int m1=80,m2=85,m3=95;
	}
	
	@Override
	public void getPercentage()
	{
		// TODO Auto-generated method stub
		int per;
		int m1=80,m2=85,m3=95;
		per =((m1+m2+m3)/300)*100;
		System.out.println("Percentage of A :"+per+"%");
	}
}
class B extends Marks
{
	B() //constructor
	{
		
	}
	@ Override
	 public void getPercentage() {
	}
	 {
		 
	 }
}
public class AbstractMarks
{
	public static void main(String[] args) 
	{
		Marks a= new A();
		a.getPercentage();
	}

}
