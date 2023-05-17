package Assignment.simple.Module2;

import java.util.ArrayList;
import java.util.List;

// Write a Java program to insert an element into the array list at the first position.

public class InsertElementArraylist 
{
	public static void main(String[] args) 
	{
		List<String> color =new ArrayList<String>();
		color.add("Red");
		color.add("Green");
		color.add("Yellow");
		color.add("Black");
		
		System.out.println(color); // display in array
		
		// insert in array
		color.add(4,"Pink");
		color.add(0,"Orange");
		System.out.println(color); // display in array after insert
	}

}
