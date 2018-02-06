
// Using break to exit a whlie loop

public class BreakLoop2
{
	public static void main(String args[])
	{
		int i=0;

		while(i < 100)
		{
			if(i == 10)
			{
				break;
			}

			System.out.println("Loop counter : " + i);

			i++;
		}

		System.out.println("Loop Complete.");
	}
}