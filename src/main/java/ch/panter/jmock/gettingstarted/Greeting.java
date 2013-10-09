package ch.panter.jmock.gettingstarted;

public class Greeting {
	private IGreetingTime igreetingTime;

	public void setGreetingTime(IGreetingTime igreetingTime) {
		this.igreetingTime = igreetingTime;
	}

	public String sayHello(String name) {
		String greeting = igreetingTime.getGreeting();
		return greeting + ", " + name;

	}
}
