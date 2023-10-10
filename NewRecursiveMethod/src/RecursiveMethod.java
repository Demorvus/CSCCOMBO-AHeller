
public class RecursiveMethod {

	public static void main(String[] args) {
		factorial(5);
		counting(5);
	}

	private static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		int product = n * factorial(n - 1);
		System.out.println(product);
		return product;
	}

	private static void counting(int n) {
		if (n == 0) {
			System.out.println(0);
		} else {
			System.out.println(n);
			counting(n - 1);
			System.out.println(n);
		}
	}
}