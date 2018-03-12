
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
public class StringManipulatorTest
{
	private String	input;
	private String	expected;
	
	private static int tests;
	private static int testsPassed = 0;
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("\nTesting StringManipulator Class toUpperCase() method.");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("Completed StringManipulator Class toUpperCase() method tests. Passed " + testsPassed + " out of " + tests + ".");
	}
	
	public StringManipulatorTest(String input, String expected)
	{
		this.input = input;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> generateData()
	{
		Object[][] data = new Object[][]
		{
			{ null, null},
			{ "", ""},
			{ "abcde", "ABCDE"},
			{ "12345", "12345"},
			{ "ABCDE", "ABCDE"},
			{ "!@#$%", "!@#$%"},
			{ "aA1 !", "AA1 !"}
		};
		
		tests = data.length;
		
		return Arrays.asList(data);
	}

	@Test
	public void testToUpperCase()
	{
		StringManipulator stringManipulator = new StringManipulator(this.input);
		try
		{
			assertEquals(this.expected, stringManipulator.toUpperCase());
			System.out.println("Passed test for parameter : \"" + this.input + "\"");
			testsPassed++;
		}
		catch(AssertionError error)
		{
			System.out.println("Failed test for parameter : \"" + this.input + "\"");
			throw error;
		}
	}
}
