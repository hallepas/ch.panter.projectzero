package ch.panter.jmock.gettingstarted;

public class FirstJUnit implements IMdpJunitDemo {

	@Override
	public boolean isEmpty(String s) {
		if (s == null || s.length() == 0) {
			return true;
		}
		return false;
	}

	@Override
	public String capitalize(String s) {
		String begin = s.substring(0, 1);
		String end = s.substring(1);
		return begin.toUpperCase() + end.toLowerCase();
	}

	@Override
	public String reverse(String s) throws NullPointerException {
		if (s == null){
			throw new NullPointerException("parameter is null");
		}
		return new StringBuilder(s).reverse().toString();
	}

	@Override
	public String join(String... strings) {
		String s = strings[0];
		for(int i = 1; i < strings.length; i++){
			s = s + " " + strings[i];
		}
		return s;
	}

}
