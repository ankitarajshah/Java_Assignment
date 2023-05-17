package Assignment.simple.Module2;

import java.util.ArrayList;
import java.util.List;

// Write a Java program to search an element in an array list.

public class SearchArrayList
{
	public static void main(String[] args) 
	{
		List<String> company = new ArrayList<String>();
		company.add("Tops Tech");
		company.add("eInfochips");
		company.add("Infosys");
		System.out.println(company);
		
		if( company.contains("Tops Tech"))
		{
			System.out.println("Element found: ");
		}
		else 
		{
			System.out.println("Element not found: ");
		}
	}

}
