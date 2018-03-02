
package com.rahulmadbhavi.training;

import java.util.concurrent.Exchanger;

public class MakeString implements Runnable
{
	Exchanger<String>	exchanger;
	String				string;

	public MakeString(Exchanger<String> exchanger)
	{
		this.exchanger = exchanger;
		string = new String();

		new Thread(this).start();
	}

	@Override
	public void run()
	{
		char ch = 'A';

		for(int i = 0; i < 3; i++)
		{
			// Fill buffer
			for(int j = 0; j < 5; j++)
				string += ch++;

			try
			{
				// Exchange a full buffer for an empty one.
				string = exchanger.exchange(string);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}
