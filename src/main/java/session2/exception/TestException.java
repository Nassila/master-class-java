package session2.exception;

public class TestException {
	
	public static void isEven(int number) throws NotEvenException {
		if (number % 2 != 0) {
			throw new NotEvenException("Le nombre est impair");
		}
	}

	public static void main(String[] args) {
		
		try {
			isEven(5);
		} catch (NotEvenException e) {
			e.printStackTrace();
		}
	}

}
