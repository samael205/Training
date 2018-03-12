package com.rahulmadbhavi.training;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest
{
	public static Calculator calculator;
	
	@BeforeClass
	public static void before()
	{
		System.out.println("Before All Tests");
		calculator = new Calculator();
	}
	
	@AfterClass
	public static void after()
	{
		System.out.println("After All Tests");
	}
	
	@Test
	public void testAdd()
	{
		System.out.println("Testing add() function.");
		assertEquals(5, calculator.add(2, 3));
	}

	@Test
	public void testSub()
	{
		System.out.println("Testing sub() function.");
		assertEquals(-1, calculator.sub(2, 3));
	}

}
