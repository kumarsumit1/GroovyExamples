package com.groovy.examples.test

import static org.junit.Assert.*

import com.groovy.Examples.HelloWorld
import org.junit.Before
import org.junit.Test

class HelloWorldTest {

	def subject;

	@Before
	void setup() {
		subject = new HelloWorld();
	}

	@Test
	void testGetMessage() {
		assertEquals("Hello World!", subject.getMessage(false));
	}

}