package Assignment.simple.Module2;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to create a new array list, add some colors (string) and
//print out the collection.
// JAVA List 

public class ListArray 
{
	public static void main(String[] args) 
	{
		List<String> list_color = new ArrayList<String>(); // create
		
		// add to list
		list_color.add("Red");
		list_color.add("Green");
		list_color.add("Blue");
		list_color.add("Yellow");
		list_color.add("Pink");
		
		System.out.println(list_color); //prints in array
		
		
	}
}
