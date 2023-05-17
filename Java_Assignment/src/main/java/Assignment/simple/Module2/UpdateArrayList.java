package Assignment.simple.Module2;
// Write a Java program to update specific array element by given element.

import java.util.ArrayList;
import java.util.List;

public class UpdateArrayList {

	public static void main(String[] args) 
	{
		List<String> name = new ArrayList<String>();
		name.add("Ankita");
		name.add("Priya");
		name.add("Geeta");
		
		System.out.println(name); //display array list
		System.out.println();
		
		//Retrieve element
		String name_get = name.get(0);
		System.out.println("First element is :"+name_get);
		
		name_get =name.get(1);
		System.out.println("Second element is :"+name_get);
		name_get =name.get(2);
		
		System.out.println("Third element is :"+name_get);
		System.out.println();
		
		//Update array list
		name_get =name.set(0,"Ram"); 
		System.out.println(name);
		
		
	}


}

