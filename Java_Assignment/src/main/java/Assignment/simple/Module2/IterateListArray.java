package Assignment.simple.Module2;

import java.util.ArrayList;
import java.util.List;

// Write a Java program to iterate through all elements in an array list.

public class IterateListArray 
{
	public static void main(String[] args) 
	{
		List<String> list_lang = new ArrayList<String>();
		
		list_lang.add("JAVA");
		list_lang.add("PYTHON");
		list_lang.add("PHP");
		list_lang.add("C++");
		
		for(String lang:list_lang)
		{
			System.out.println(lang);
		}
	}
}
