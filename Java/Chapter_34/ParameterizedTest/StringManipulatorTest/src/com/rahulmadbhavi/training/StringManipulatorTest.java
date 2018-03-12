
package com.rahulmadbhavi.training;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringManipulatorTest
{
	private String	input;
	private String	expected;

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
		
		return Arrays.asList(data);
	}

	@Test
	public void testToUpperCase()
	{
		StringManipulator stringManipulator = new StringManipulator(this.input);
		System.out.println("Testing toUpperCase() method with parameter : " + this.input);
		assertEquals(this.expected, stringManipulator.toUpperCase());
	}
}
