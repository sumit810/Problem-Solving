package BitwiseManipulation;

import java.util.Scanner;

public class CheckingEvenAndOdd {
	public static void main(String... s) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scan.nextInt();
		checkEvenAndOddNumber(num);
		scan.close();
	}

	private static void checkEvenAndOddNumber(int num) {
		if ((num & 1) == 0) {
			System.out.println(num + " is an even number!");
		} else {
			System.out.println(num + " is an odd number!");
		}

	}
}
