
// Demonstrating automatic type conversion

public class AutoTypeConversion
{
	public static void main(String args[])
	{
		// Define variables
		byte 	a = 40;
		byte	b = 50;
		byte 	c = 100;

		int 	d = a * b / c;

		System.out.println("a*b/c is " + d);

		// No auto conversion Example
		byte 	e = 50;
		// Uncommenting the next line will result in an error
		//e = e * 2;

		// Explicit cast
		byte	f = 63;
		f = (byte) (f * 2);
		System.out.println("Value of f is " + f);

		// Explicit cast
		byte	g = 64;
		g = (byte) (g * 2);
		System.out.println("Value of g is " + g);
	}
}