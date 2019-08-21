package com.virtusa.numbers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumberWordsTest {
	
	private NumberUtility util;

	@Before
	public void setup() {
	      util = new NumberUtility();
	}
	
	@Test
	public void testSingleDigit()
	{
		int num = 9;
		assertEquals(util.getTextOfNumber(num).trim(),"nine");
	}
	@Test
	public void testDoubleDigit()
	{
		int num = 19;
		assertEquals(util.getTextOfNumber(num).trim(),"nineteen");
	}
	@Test
	public void testThreeDigits()
	{
		int num = 345;
		assertEquals(util.getTextOfNumber(num).trim(),"three hundred and forty five");
	}
	@Test
	public void testThousands()
	{
		int num = 200345;
		assertEquals(util.getTextOfNumber(num).trim(),"two hundred thousand three hundred and forty five");
	}
	@Test
	public void testMillions()
	{
		int num = 123200345;
		assertEquals(util.getTextOfNumber(num).trim(),"one hundred and twenty three million two hundred thousand three hundred and forty five");
	}

}
