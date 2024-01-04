package org.comviva.Assignment.stringutil;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.comviva.Assignment.stringutils.StringFunctions;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.platform.commons.util.StringUtils;



public class StringFunctionsTest {
	
	private StringFunctions stringUtils;
	@Before
	public void setup()
	{
		stringUtils = new StringFunctions();
		System.out.println("Setup");
	}

	@Test
	public void test_reverse_string()
	{
		
		assertEquals(stringUtils.reverse("Bhavya"), "Sharma");
		
	}
	
	@Test
	public void test_palindrom()
	{
		
		assertEquals(stringUtils.isPalindrome("Bhavya"),stringUtils.isPalindrome("Sharma"));
	}
	
	@Test
	public void test_concatenate()
	{
		
		assertEquals(stringUtils.concatenate("first", "second"),"firstsecond");
	}
	
	@Test
	public void test_occurance()
	{
		
		assertEquals(stringUtils.countOccurrences("Bhavya", 'a'), 2);
	}
}
