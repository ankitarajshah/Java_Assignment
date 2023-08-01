package Assignment.simple.Module2;

//W.A.J.P to get the character at the given index within the String. Original 
//String = Tops Technologies! The character at position 0 is T, The character 
//at position 10 is o

public class Q1_Index_String 
{
	public static void main(String[] args) 
	{
		String str ="Tops Technologies";
		System.out.println("Original String = "+str);
		
		int index1 = str.charAt(0);
		int index2 =str.charAt(10);
		
		System.out.println("The character at position 0 is :"+(char)index1);
		System.out.println("The character at position 0 is :"+(char)index2);
	}
}
