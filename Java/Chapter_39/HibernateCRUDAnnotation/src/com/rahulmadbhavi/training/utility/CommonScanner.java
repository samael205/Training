package com.rahulmadbhavi.training.utility;

import java.util.Scanner;

public class CommonScanner
{
	private static final Scanner SCANNER;
	
	static
	{
		SCANNER = new Scanner(System.in);
	}
	
	public static Scanner getScanner()
	{
		return SCANNER;
	}
	
	public static void closeScanner()
	{
		SCANNER.close();
	}	
}
