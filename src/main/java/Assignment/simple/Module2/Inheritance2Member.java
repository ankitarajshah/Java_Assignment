package Assignment.simple.Module2;

//Create a class named 'Member' having the following members:
//Data members 
//Name
//Age
//Phone number
//Address 5 - Salary
//It also has a method named 'printSalary' which prints the salary of the 
//members.
//Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 
//'Employee' and 'Manager' classes have data members 'specialization' and 
//'department' respectively. Now, assign name, age, phone number, 
//address and salary to an employee and a manager by making an object of 
//both of these classes and print the same.

//Hierarchical

class Member
{
	String name, address;
	int age,phoneNo,salary;
	
	public void printSalary()
	{
		System.out.println("Salary of "+ name + " is :"+salary );
	}
}

class Employee extends Member
{
	String specialiazation;
	public void setDataEmp()
	{
		name ="Ankita";
		age=32;
		phoneNo =123654789;
		salary=1452;
	}
	
}
class Manager extends Member 
{
	String department;
	public void setDataMng()
	{
		name ="Nikita";
		age=35;
		phoneNo =123654789;
		salary=145632;
	}
	public void showData()
	{
		System.out.println("Nmae is :"+name);
		System.out.println("Age is :"+age);
		System.out.println("Phone number is :"+phoneNo);
		System.out.println("Salary is :"+salary);
	}
}

public class Inheritance2Member 
{
	public static void main(String[] args) 
	{
		
		Employee e  =new Employee();
		e.setDataEmp(); // hpw to show data of emp ask sir
	
		
		Manager m =new Manager();
		m.setDataMng();
		m.showData();
		
		e.printSalary();
		m.printSalary();
	}
}
