// Test for primes.

public class PrimeTest
{
	public static void main(String args[])
	{
		int num;
		boolean isPrime = true;

		num = 14;
		for(int i=2; i<=num/i; i++)
		{
			if(num%i == 0)
			{
				isPrime = false;
				break;
			}
		}

		if(isPrime)
		{
			System.out.println(num + " is prime.");
		}
		else		
		{
			System.out.println(num + " is not prime.");
		}
		
	}
}