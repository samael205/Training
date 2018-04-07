package com.rahulmadbhavi.training.utility;

import java.util.Scanner;

public class CommonScanner
{
	private static Scanner scanner;
	
	static
	{
		scanner = new Scanner(System.in);
	}
	
	public static Scanner getScanner()
	{
		return scanner;
	}
	
	public static void closeScanner()
	{
		scanner.close();
	}
}
