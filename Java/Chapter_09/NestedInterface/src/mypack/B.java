
package mypack;

class B implements A.NestedIf
{
	public boolean isPositive(int x)
	{
		return x<0 ? false : true;
	}
}