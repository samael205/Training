
package mypack;

class Client2 implements Callback
{
	public void callback(int param)
	{
		System.out.println("callback of Client2 called with " + param);
	}

	void nonIfaceMethod()
	{
		System.out.println("Non interface method.");
	}
}