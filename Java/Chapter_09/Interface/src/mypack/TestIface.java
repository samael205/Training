
package mypack;

class TestIface
{
	public static void main(String args[])
	{
		Callback callback;

		callback = new Client();
		callback.callback(42);

		callback = new Client2();
		callback.callback(84);
	}
}