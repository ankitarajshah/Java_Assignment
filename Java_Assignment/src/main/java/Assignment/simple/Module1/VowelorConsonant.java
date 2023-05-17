package Assignment.simple.Module1;

import java.util.Scanner;

public class VowelorConsonant 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the alphabet");
		
		String input =sc.nextLine().toLowerCase();
		
		boolean uppercase = input.charAt(0)>=65 && input.charAt(0)<= 90;
		boolean lowercase = input.charAt(0)>=97 && input.charAt(0)<=122;
		boolean vowel = input.equals("a")||input.equals("e")||input.equals("i")||
				input.equals("o")||input.equals("u");
		
		if(input.length()>1)
		{
			System.out.println("Error. Not a single character...."+input);
		}
		else if(!(uppercase||lowercase))
		{
			System.out.println("Error.Not an alphabet.Enter Uppercase or Lowercase..."+input);
		}
		else if(vowel)
		{
			System.out.println("Input is vowel..."+input);
		}
		else
		{
			System.out.println("Input is consonant..."+input);
		}
				

	}
}
