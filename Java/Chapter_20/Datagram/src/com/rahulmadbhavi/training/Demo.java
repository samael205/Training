
package com.rahulmadbhavi.training;

import java.net.*;

class Demo
{
	public static int serverPort = 998;
	public static int clientPort = 999;
	public static int buffer_size = 1024;
	public static DatagramSocket ds;
	public static byte buffer[] = new byte[buffer_size];

	public static void server() throws Exception
	{
		int pos = 0;

		while(true)
		{
			int c = System.in.read();
			switch(c)
			{
				case -1 : 
							System.out.println("Server Quits.");
							return;

				case '\r' :
							break;

				case '\n' :
							ds.send(new DatagramPacket(buffer, pos, InetAddress.getLocalHost(), clientPort));
							pos = 0;
							break;

				default :
							buffer[pos++] = (byte) c;
			}
		}
	}

	public static void client() throws Exception
	{
		while(true)
		{
			DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
			ds.receive(dp);
			System.out.println(new String(dp.getData(), 0, dp.getLength()));
		}
	}

	public static void main(String args[]) throws Exception
	{
		if((args.length != 1) || (!(args[0].equalsIgnoreCase("client") || args[0].equalsIgnoreCase("server"))))
		{
			System.out.println("Syntax: java -cp bin com.rahulmadbhavi.training.Demo server");
			System.out.println("Syntax: java -cp bin com.rahulmadbhavi.training.Demo client");			
		}
		else
		{
			if(args[0].equalsIgnoreCase("client"))
			{
				ds = new DatagramSocket(clientPort);
				client();
			}
			else
			{
				ds = new DatagramSocket(serverPort);
				server();
			}
		}
	}
}