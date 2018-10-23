package Mathematics;

import java.util.Scanner;

public class PrimeNumberChecker {
	public static void main(String... s) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while (T > 0) {
			int number = scan.nextInt();
			boolean result = IsPrime(number);
			if (result) {
				System.out.println("Prime");
			} else {
				System.out.println("Not prime");
			}
			T--;
		}
	}

	private static boolean IsPrime(int number) {
		boolean isPrime = false;
		if (number == 1) {
			isPrime = false;
			return isPrime;
		}
		if (number == 2) {
			isPrime = true;
			return isPrime;
		}

		for (int i = 2; i * i <= number; i++) {
			if (number % i == 0) {
				isPrime = false;
				return isPrime;
			}
		}
		isPrime = true;
		return isPrime;
	}
}
