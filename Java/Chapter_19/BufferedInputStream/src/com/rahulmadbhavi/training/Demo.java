
package com.rahulmadbhavi.training;

import java.io.*;

class Demo
{
	public static void main(String args[]) throws IOException
	{
		String string = "This is a &copy; copyright symbol " +
						"but this is &copy not.\n";

		byte buffer[] = string.getBytes();

		ByteArrayInputStream in = new ByteArrayInputStream(buffer);
		BufferedInputStream fin = new BufferedInputStream(in);
		int c;
		boolean marked = false;

		while((c = fin.read()) != -1)
		{
			switch(c)
			{
				case '&' :
							if(!marked)
							{
								fin.mark(32);
								marked = true;
							}
							else
							{
								marked = false;
							}

							break;

				case ';' : 
							if(marked)
							{
								marked = false;
								System.out.print("(c)");
							}
							else
							{
								System.out.print((char) c);
							}

							break;

				case ' ' :
							if(marked)
							{
								marked = false;
								fin.reset();
								System.out.print("&");
							}
							else
							{
								System.out.print((char) c);
							}

							break;

				default :
							if(!marked)
							{
								System.out.print((char) c);
							}

							break;
			}
		}
	}
}