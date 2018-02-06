
// Demonstrate Block Scope

public class Scope
{
	public static void main(String args[])
	{
		// Variables known to whole of main block
		int x = 10;

		if(x == 10)
		{
			// Following variables known only to this block
			int y = 20;

			// x and y are both known
			System.out.println("x and y are " + x + " and " + y);

			x = y * 2;
		}

		// Next line will result in error if uncommented
		// y = 100;

		// x is still known here
		System.out.println("x is " + x);
	}
}