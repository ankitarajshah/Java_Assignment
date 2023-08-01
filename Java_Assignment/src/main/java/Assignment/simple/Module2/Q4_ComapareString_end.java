package Assignment.simple.Module2;

//W.A.J.P to check whether a given string ends with the contents of another 
//string.
//"Java Exercises" ends with "se"? False 
//"Java Exercise" ends with "se"? True
public class Q4_ComapareString_end 
{
	public static void main(String[] args) 
	{
		String s1 ="Java Exercises";
		String s2 ="Java Excercise";
		String end_s ="se";
		
		boolean ends1 =s1.endsWith(end_s);
		boolean ends2 =s2.endsWith(end_s);
		
		System.out.println(s1 +" ends with "+ s2 +" :" +  ends1);
		System.out.println(s1 +" ends with "+ s2 +" :" +  ends2);
		
		
		
	}
}
