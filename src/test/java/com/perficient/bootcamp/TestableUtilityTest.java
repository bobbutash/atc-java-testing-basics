package com.perficient.bootcamp;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestableUtilityTest {

	@BeforeAll
	public static void beforeAll() {
		System.out.println("BEFORE ALL METHOD");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("BEFORE EACH METHOD");
	}
	
	@Test
	public void testAppendToString() {
		String actual = TestableUtility.appendToString("Hello", "World");
		assertEquals(actual, "Hello World");
	}
	
	/**
	 * Implement this test method to obtain 100% code coverage.
	 */
	@Test
	public void testAppendToStringNullParameters() {
	}
	
	/**
	 * Implement this test method to obtain 100% code coverage.
	 */
	@Test
	public void testAppendToStringNullSecondParameter() {
	}
	
	/**
	 * Implement this test method to obtain 100% code coverage.
	 */
	@Test
	public void testAppendToStringFirstParameters() {
	}
	
	@Test
	public void testAdd() {
		Integer actual = TestableUtility.add(Integer.valueOf(1), Integer.valueOf(2));
		assertEquals(actual, Integer.valueOf(3));
	}
	
	@Test
	public void testAddSecondValueNull() {
		Integer actual = TestableUtility.add(Integer.valueOf(1), null);
		assertEquals(actual, Integer.valueOf(1));
	}
	
	@Test
	public void testAddFirstValueNull() {
		Integer actual = TestableUtility.add(null, Integer.valueOf(2));
		assertEquals(actual, Integer.valueOf(2));
	}
	
	@Test
	public void testAddBothValuesNull() {
		Integer actual = TestableUtility.add(null, null);
		assertNull(actual);
	}
	
	@Test
	public void testABString() {
		assertTrue(TestableUtility.abString("aaabbb"));
	}
	
	@Test
	public void testABStringFailure() {
		assertTrue(!TestableUtility.abString("aaaba"));
	}
	
	@Test
	public void testABStringFailureFirstPosition() {
		assertTrue(!TestableUtility.abString("baaaab"));
	}
	
	@Test
	public void testABStringFailureRepeating() {
		assertTrue(!TestableUtility.abString("aaabab"));
	}
	
	@Test
	public void testABStringAllA() {
		assertTrue(TestableUtility.abString("aaa"));
	}
	
	@Test
	public void testABStringAllB() {
		assertTrue(TestableUtility.abString("bbbb"));
	}
	
	@Test
	public void testABStringBFollowedByA() {
		assertTrue(!TestableUtility.abString("bbbba"));
	}
	
	
	
	@AfterEach
	public void afterEach() {
		System.out.println("AFTER EACH METHOD");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("AFTER ALL METHOD");
	}
	
}
