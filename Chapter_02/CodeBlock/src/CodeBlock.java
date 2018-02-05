/*
	 Demonstrate a block of code
*/

public class CodeBlock
{
	public static void main(String args[])
	{
		int x, y;

		y = 20;

		// The target of the following loop is a block
		for(x=0; x<10; x++)
		{
			System.out.println("This is x " + x);
			System.out.println("This is y " + y);
			y-=2;
		}
	}
}