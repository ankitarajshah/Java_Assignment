package Assignment.simple.Module2;

//Create a class to print an integer and a character with two methods having 
//the same name but different sequence of the integer and the character 
//parameters. For example, if the parameters of the first method are of the 
//form (int n, char c), then that of the second method will be of the form 
//(char c, int n).

class PrintIntCha
{
	public void print(int n,char c)
	{
		System.out.println("Integer is :"+n+ " and Character is :"+c);
	}
	public void print(char c,int n)
	{
		System.out.println("Character is : "+ c +" and Integer is :"+n);
	}
}

public class PrintIntChar 
{
	public static void main(String[] args) 
	{
		PrintIntCha p =new PrintIntCha();
		p.print(2, 'a');
		p.print('a',27);
	}

}
