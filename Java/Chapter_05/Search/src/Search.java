
// Search an array for presence of element

public class Search
{
	public static void main(String args[])
	{
		int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int val = 5;
		boolean isFound = false;

		for(int x : nums)
		{
			if(x == val)
			{
				isFound = true;
				break;
			}
		}

		if(isFound)
		{
			System.out.println("Value is found.");
		}
		else
		{
			System.out.println("Value is not found.");
		}
	}
}