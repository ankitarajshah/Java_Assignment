package Assignment.simple.Module2;

//W.A.J.P to compare a given string to the specified character sequence.
//Comparing topsint.com and topsint.com: true 
//Comparing Topsint.com and topsint.com: false

public class Q3_CompareString 
{
	public static void main(String[] args) 
	{
		String s1="topsint.com";
		String s2="Topsint.com";
		CharSequence cs ="topsint.com";
		System.out.println("Comparing "+s1+" and "+cs+" :"+s1.contentEquals(cs));
		System.out.println("Comparing "+s2+" and "+cs+" :"+s2.contentEquals(cs));
	}

}
