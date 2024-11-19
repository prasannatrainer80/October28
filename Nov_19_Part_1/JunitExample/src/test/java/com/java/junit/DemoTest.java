package com.java.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DemoTest {

	static Demo demo;
	
	@BeforeClass
	public static void setUp() {
		demo = new Demo();
		System.out.println("Before Class Method called");
	}
	@Before
	public void header() {
		System.out.println("This for Before all Test Cases...");
	}
	
	@After
	public void footer() {
		System.out.println("This for After all Test Cases...");
	}
	@Test
	public void testEvenOdd() {
		assertTrue(demo.evenOdd(4));
		assertFalse(demo.evenOdd(3));
	}
	@Test
	public void testCheckNull() {
		Demo demo = null;
		assertNull(demo);
		demo = new Demo();
		assertNotNull(demo);
	}
	
	@Test
	public void testArrayEquals() {
		int[] a = new int[] {1,2,3};
		int[] b = new int[] {1,2,3};
		assertArrayEquals(a, b);
	}
	
	@Test
	public void testMax3() {
		assertEquals(5, demo.max3(5, 2, 3));
		assertEquals(5, demo.max3(2, 5, 3));
		assertEquals(5, demo.max3(2, 3, 5));
	}
	
	@Test
	public void testFact() {
		assertEquals(120, demo.fact(5));
	}
	
	@Test
	public void testSum() {
		assertEquals(5, demo.sum(2, 3));
	}
	
	@Test
	public void testSayHello() {
		assertEquals("Welcome to Junit...", demo.sayHello());
	}

	@AfterClass
	public static void cleanUp() {
		demo = null;
		System.out.println("AfterClass Annotated Method Called...");
	}
}
