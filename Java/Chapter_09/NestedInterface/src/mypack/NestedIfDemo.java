
package mypack;

class NestedIfDemo
{
	public static void main(String args[])
	{
		A.NestedIf nif = new B();

		if(nif.isPositive(10))
		{
			System.out.println("10 is not negative.");
		}
		if(nif.isPositive(-12))
		{
			System.out.println("This won\'t be displayed");
		}
	}
}