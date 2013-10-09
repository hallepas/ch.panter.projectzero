package ch.panter.junit.gettingstarted;

import static org.junit.Assert.*;

import org.junit.Test;

import ch.panter.jmock.gettingstarted.Greeting;

public class GreetingJMockTest {

	@Test
	public void testSayGreeting() {
		Greeting greeting = new Greeting();
		String out = greeting.sayHello("hi there");
		assertEquals("Good afternoon, hi there", out);

	}
}
