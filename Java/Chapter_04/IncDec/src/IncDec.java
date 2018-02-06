// Demonstrate increment operator

public class IncDec
{
	public static void main(String args[])
	{
		int a = 1;
		int b = 2;

		int c;
		int d;

		c = ++b;
		d = a++;

		System.out.println("a is " + a);
		System.out.println("b is " + b);
		System.out.println("c is " + c);
		System.out.println("d is " + d);
	}
}