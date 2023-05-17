package Assignment.simple.Module2;

import java.util.ArrayList;
import java.util.List;

// Write a Java program to retrieve an element (at a specified index) from a given array list.

public class RetrieveArrayList 
{
	public static void main(String[] args) 
	{
		List<String> name = new ArrayList<String>();
		name.add("Ankita");
		name.add("Raj");
		name.add("Jaksh");
		
		System.out.println(name); //display array list
		
		//Retrieve element
		String name_get = name.get(0);
		System.out.println("First element is :"+name_get);
		
		name_get =name.get(1);
		System.out.println("Second element is :"+name_get);
		name_get =name.get(2);
		System.out.println("Third element is :"+name_get);
		
		
	}


}
