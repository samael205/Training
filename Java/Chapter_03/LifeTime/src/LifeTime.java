
// Demonstrate lifetime of a variable

public class LifeTime
{
	public static void main(String args[])
	{
		int x;

		for(x=0; x<3; x++)
		{
			// y is initialised each time block is entered
			int y = -1;

			System.out.println("y is " + y);

			y = 100;

			System.out.println("y is now " + y);
		}
	}
}