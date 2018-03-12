package com.rahulmadbhavi.training;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest
{
	Calculator calculator;
	
	@Before
	public void before()
	{
		System.out.println("Before Test");
		calculator = new Calculator();
	}
	
	@After
	public void after()
	{
		System.out.println("After Test");
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
