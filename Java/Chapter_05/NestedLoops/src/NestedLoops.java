
// Loops may be nested

public class NestedLoops
{
	public static void main(String args[])
	{
		int i, j;

		for(i=0; i<10; i++)
		{
			for(j=0; j<=i; j++)
			{
				System.out.print("#");
			}

			System.out.println();
		}
	}
}