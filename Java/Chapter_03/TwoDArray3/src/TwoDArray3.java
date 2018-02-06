
// Demonstrate initialising 2D arrays

public class TwoDArray3
{
	public static void main(String args[])
	{
		double m[][] = 
		{
			{0, 1, 2, 3},
			{1, 2, 3, 4},
			{2, 3, 4, 5},
			{3, 4, 5, 6}
		};

		int i, j;

		System.out.println("The matrix is");
		for(i=0; i<4; i++)
		{
			for(j=0; j<4; j++)
			{
				System.out.print(m[i][j] + " ");
			}

			System.out.println();
		}
	}
}