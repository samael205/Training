
// Demonstrate dynamic initialisation

public class DynInit
{
	public static void main(String args[])
	{
		double a = 3.0;
		double b = 4.0;

		// c is dynamically initialised
		double c = Math.sqrt(a*a + b*b);

		System.out.println("Length of hypotenuse is " + c + " units.");
	}
}