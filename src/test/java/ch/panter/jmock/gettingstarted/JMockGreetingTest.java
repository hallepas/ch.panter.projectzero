package ch.panter.jmock.gettingstarted;

import static org.junit.Assert.assertEquals;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

public class JMockGreetingTest {
	Mockery context = new Mockery();

	@Test
	public void testSayHello() {
		final IGreetingTime igreetingtime = context.mock(IGreetingTime.class);
		Greeting greeting = new Greeting();
		greeting.setGreetingTime(igreetingtime);
		
		//expectations
		context.checking(new Expectations(){{
			
			one(igreetingtime).getGreeting();will(returnValue("Good afternoon"));
		}});
		
		String out = greeting.sayHello("hi there");
		assertEquals("Good afternoon, hi there",out);
	}
}
