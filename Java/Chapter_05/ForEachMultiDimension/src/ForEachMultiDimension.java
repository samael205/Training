
// For each style loop in multi dimension array

public class ForEachMultiDimension
{
	public static void main(String args[])
	{
		int sum = 0;
		int nums[][] = new int [3][4];

		for(int i=0; i<nums.length; i++)
		{
			for(int j=0; j<nums[i].length; j++)
			{
				nums[i][j] = i + j;
			}
		}

		System.out.println("The matrix is");
		for(int x[] : nums)
		{
			for(int y : x)
			{
				System.out.print(y + " ");
			}

			System.out.println();
		}
	}
}