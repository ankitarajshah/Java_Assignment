package Assignment.simple.Module2;
//Write a Java program to remove the third element from an array list.

import java.util.ArrayList;
import java.util.List;

public class RemoveArrayList 
{
	public static void main(String[] args) 
	{
		List<String> list_color = new ArrayList<String>(); // create
		
		// add to array list
		list_color.add("Red");
		list_color.add("Green");
		list_color.add("Blue");
		list_color.add("Yellow");
		list_color.add("Pink");
		
		System.out.println(list_color); //prints in array
		
		//Remove third element
		list_color.remove(2);
		System.out.println(list_color); //prints in array after remove 
	}
}
