
package mypack;

class Client implements Callback
{
	public void callback(int param)
	{
		System.out.println("callback of Client called with " + param);
	}

	void nonIfaceMethod()
	{
		System.out.println("Non interface method.");
	}
}