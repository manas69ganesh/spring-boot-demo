package com.manas.demo.controller;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestAuthTokenController {

	private String token = null;

	@Before
	public void setUp() {
		token = "abcd123";
		System.out.println("Token in Test = " + token);
	}

	@Test
	public void testToken() {
		assertEquals("abcd123", token);
	}

	@After
	public void cleanUp() {
		System.out.println("Token Test Completed.");
	}
}
