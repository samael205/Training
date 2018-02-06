
// Demonstrate a two-dimensional array

public class TwoDArray
{
	public static void main(String args[])
	{
		int twoD[][] = new int[4][5];

		int i, j;

		for(i=0; i<3; i++)
		{
			for(j=0; j<4; j++)
			{
				twoD[i][j] = i + j;
			}
		}

		for(i=0; i<3; i++)
		{
			for(j=0; j<4; j++)
			{
				System.out.print(twoD[i][j] + " ");
			}

			System.out.println("");
		}
	}
}