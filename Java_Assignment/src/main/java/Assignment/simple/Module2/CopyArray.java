package Assignment.simple.Module2;
// Write a Java program to copy one array list into another.

public class CopyArray
{
	public static void main(String[] args) 
	{
		int a[] =new int[] {1,2,3,4,5,6,7,8,9};
		int b[]= new int[a.length];
		
		for(int i=0;i<a.length;i++) // copy array a to array b
		{
			b[i]=a[i];
		}
		System.out.println("Elements of Array A");
		for(int i=0;i<a.length;i++) // display array a
		{
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		
		System.out.println("Elements of Array B after copy");
		for(int i=0;i<a.length;i++) // after copy display  array b
		{
			System.out.print(b[i]+ " ");
		}
				
	}
}
