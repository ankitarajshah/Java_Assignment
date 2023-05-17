package Assignment.simple.Module1;

import java.util.Scanner;

public class CountLetter 
{
	public static void main(String[] args) 
	{
		String inp = "Tops Tech 1234 !@#$%";
		count(inp);
		
	}
	public static void count(String inp)
	{
		char[] ch=inp.toCharArray(); //Java String toCharArray() method example
		int letter =0;
		int space =0;
		int number=0;
		int other=0;
		for (int i=0;i<inp.length();i++)
		{
			if(Character.isLetter(ch[i]))
			{
				letter ++;	
			}
			else if(Character.isDigit(ch[i]))
			{
				number ++;
			}
			else if(Character.isSpaceChar(ch[i]))
			{
				space ++;
			}
			else
			{
				other ++;
			}
		}
		System.out.println("The String is :"+inp);
		System.out.println("Letter is :"+letter);
		System.out.println("Number is :"+number);
		System.out.println("Space is :"+space);
		System.out.println("Other is :"+other);
	}
}
