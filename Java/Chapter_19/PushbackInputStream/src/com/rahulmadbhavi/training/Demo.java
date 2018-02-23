
package com.rahulmadbhavi.training;

import java.io.*;

class Demo
{
	public static void main(String args[]) throws IOException
	{
		String string = "if (a == 4) a = 0;\n";

		byte buffer[] = string.getBytes();

		ByteArrayInputStream in = new ByteArrayInputStream(buffer);
		PushbackInputStream f = new PushbackInputStream(in);
		int c;

		while((c = f.read()) != -1)
		{
			switch(c)
			{
				case '=' : 
							if((c = f.read()) == '=')
							{
								System.out.print(".eq.");
							}
							else
							{
								System.out.print("<-");
								f.unread(c);
							}

							break;

				default :
							System.out.print((char) c);
							break;
			}
		}
	}
}