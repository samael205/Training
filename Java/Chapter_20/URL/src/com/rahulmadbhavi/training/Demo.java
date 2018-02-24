
package com.rahulmadbhavi.training;

import java.net.*;

class Demo
{
	public static void main(String args[]) throws MalformedURLException
	{
		URL url = new URL("http://www.osborne.com/downloads");

		System.out.println("Protocol : " + url.getProtocol());
		System.out.println("Port     : " + url.getPort());
		System.out.println("Host     : " + url.getHost());
		System.out.println("File     : " + url.getFile());
		System.out.println("Ext.     : " + url.toExternalForm());
	}
}