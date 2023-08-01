package Assignment.simple.Module2;
// Create a class named 'PrintNumber' to print various numbers of different 
//data types by creating different methods with the same name 'printn' 
//having a parameter for each data type.


//method overloading- method name same with different parameters
class PrintNumber
{
	public void printn(int a)
	{
		System.out.println("Integer : "+a);
	}
	public void printn(float a)
	{
		System.out.println("Float : "+a);
	}
	public void printn(double a)
	{
		System.out.println("Double : "+a);
	}
	public void printn(long a)
	{
		System.out.println("Long : "+a);
	}
	public void printn(boolean a)
	{
		System.out.println("Boolean : "+a);
	}
	public void printn(String a)
	{
		System.out.println("String : "+a);
	}
}
public class Q8_ClassPrintDatatype 
{
	public static void main(String[] args) 
	{
		PrintNumber n = new PrintNumber();
		n.printn(20);
		n.printn(12.2f);
		n.printn(50.23);
		n.printn(100000000000L);
		n.printn(false);
		n.printn("welcome to world");
	}
}
