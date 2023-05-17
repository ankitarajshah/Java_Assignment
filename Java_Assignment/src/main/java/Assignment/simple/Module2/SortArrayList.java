package Assignment.simple.Module2;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class SortArrayList 
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
		
		System.out.println("Before Sort: "+list_color); //prints in array
		//Sort element
		Collections.sort(list_color);		
		System.out.println("After Sort: "+list_color); //prints in array after sort
	}

}
