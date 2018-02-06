
// Demonstrate the boolean logical operators

public class BoolLogic
{
	public static void main(String args[])
	{
		boolean a = true;
		boolean b = false;

		boolean c = a | b;
		boolean d = a & b;
		boolean e = a ^ b;
		boolean f = (!a & b) | (a & !b);
		boolean g = !a;

		System.out.println("a is " + a);
		System.out.println("b is " + b);
		System.out.println("c is " + c);
		System.out.println("d is " + d);
		System.out.println("e is " + e);
		System.out.println("f is " + f);
		System.out.println("g is " + g);
	}
}