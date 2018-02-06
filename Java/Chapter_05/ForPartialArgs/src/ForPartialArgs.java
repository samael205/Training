
// For loop with some parameters missing

public class ForPartialArgs
{
	public static void main(String args[])
	{
		int i;
		boolean isDone = false;

		i = 0;
		for(; !isDone; )
		{
			System.out.println("i is " + i);

			if(i == 10)
			{
				isDone = true;
			}

			i++;
		}
	}
}