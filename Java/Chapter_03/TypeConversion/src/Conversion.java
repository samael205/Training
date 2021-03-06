
// Demonstrate type conversions

public class Conversion
{
	public static void main(String args[])
	{
		byte b;
		int i = 128;
		double d = 323.142;

		System.out.println("\nConversion of int to byte.");
		b = (byte) i;
		System.out.println("i and b are " + i + " and " + b);

		System.out.println("\nConversion of double to int.");
		i = (int) d;
		System.out.println("i and d are " + i + " and " + d);

		System.out.println("\nConversion of double to byte.");
		b = (byte) d;
		System.out.println("d and b are " + d + " and " + b);
	}
}