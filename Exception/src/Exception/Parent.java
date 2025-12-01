package Exception;

public class Parent {

	public static void main(String[] args) {

		int a = 8;
		int b = 0;
		int c;
		String s = null;

		// First try block → ArithmeticException
		try {
			c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		// Second try block → NullPointerException
		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
}