
package com.rahulmadbhavi.training;

import java.util.concurrent.Exchanger;

public class UseString implements Runnable
{
	Exchanger<String>	exchanger;
	String				string;

	UseString(Exchanger<String> exchanger)
	{
		this.exchanger = exchanger;

		new Thread(this).start();
	}

	@Override
	public void run()
	{
		for(int i = 0; i < 3; i++)
		{
			try
			{
				// Exchange an empty buffer for a full one.
				string = exchanger.exchange(new String());
				System.out.println("Got : " + string);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}
