
// The target of a loop can be empty

public class NoBodyWhile
{
	public static void main(String args[])
	{
		int i, j;

		i = 100;
		j = 200;

		// Find the midpoint of i and j
		while(++i < --j);

		System.out.println("Midpoint is " + i + ".");
	}
}