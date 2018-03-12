package com.rahulmadbhavi.training;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorTest
{
	private static Calculator calculator;
	
	private int input1;
	private int input2;
	private int expected;
	
	private static int tests;
	private static int testsPassed = 0;
	
	static
	{
		calculator = new Calculator();
	}

	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("\nTesting Calculator Class add() method.");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("Completed Calculator Class add() method tests. Passed " + testsPassed + " out of " + tests + ".");
	}
	
	public CalculatorTest(int input1, int input2, int expected)
	{
		this.input1 = input1;
		this.input2 = input2;
		this.expected = expected;
	}
	
	@Parameters
	public static Collection<Object[]> generateData()
	{
		Object[][] data = new Object[][]
		{
			{ 1, 2, 3},
			{ 1, 0, 1},
			{ -1, 2, 1},
			{ -1, -2, -3}
		};
		
		tests = data.length;
		
		return Arrays.asList(data);
	}
	
	@Test
	public void testAdd()
	{
		try
		{
			assertEquals(this.expected, calculator.add(this.input1, this.input2));
			System.out.println("Passed test for parameters : (" + this.input1 + ", " + this.input2 + ")");
			testsPassed++;
		}
		catch(AssertionError error)
		{
			System.out.println("Failed test for parameters : (" + this.input1 + ", " + this.input2 + ")");
			throw error;
		}
	}

}
