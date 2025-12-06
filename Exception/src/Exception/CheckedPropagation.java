package Exception;

public class CheckedPropagation {
	public static void main(String[] args) throws Exception {
		try {
			dad();
		}

		catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

	public static void dad() throws Exception {

		mom();
	}

	public  static  void mom() throws Exception {

		son();
	}

	public  static void son() throws Exception {
		throw new Exception("Exceptionnnn");

	}
}
