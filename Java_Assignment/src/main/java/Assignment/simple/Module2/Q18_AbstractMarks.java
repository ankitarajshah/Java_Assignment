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
	abstract public float getPercentage();
}
class A extends Marks
{
	float marks1,marks2,marks3;
	public A(float m1,float m2,float m3) //constructor
	{
		marks1=m1;
		marks2=m2;
		marks3=m3;
	}
	
	@Override
	public float getPercentage()
	{
		// TODO Auto-generated method stub
		return((marks1+marks2+marks3)/300)*100;
	}
}
class B extends Marks
{
	float marks1,marks2,marks3,marks4;
	public B(float m1,float m2,float m3,float m4) //constructor
	{
		marks1=m1;
		marks2=m2;
		marks3=m3;
		marks4=m4;
	}
	
	@Override
	public float getPercentage()
	{
		// TODO Auto-generated method stub
		return((marks1+marks2+marks3+marks4)/400)*100;
	}
}
public class Q18_AbstractMarks
{
	public static void main(String[] args) 
	{
		A studentA = new A(80,85,90);
		
		System.out.println("Percentage for studentA:"+studentA.getPercentage()+"%");
		B studentB = new B(75,80,85,90);
		//studentB.getPercentage();
		System.out.println("Percentage for studentA:"+studentB.getPercentage()+"%");

	}

}
