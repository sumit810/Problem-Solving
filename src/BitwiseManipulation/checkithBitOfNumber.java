package BitwiseManipulation;

import java.util.Scanner;

public class checkithBitOfNumber {
	public static void main(String... s) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scan.nextInt();
		System.out.println("Enter the ith bit of a number to see if its set or not set");
		int bit = scan.nextInt();
		boolean result = checkithBitSetOrNotSet(num, bit);
		scan.close();
		if (result) {
			System.out.println("Ith bit of a number is set!");
		} else {
			System.out.println("Ith bit of a number is not set!");
		}
	}

	private static boolean checkithBitSetOrNotSet(int num, int bit) {
		boolean check = false;
		int x = num & (1 << bit);
		if (x != 0) {
			check = true;
		} else {
			check = false;
		}
		return check;
	}
}
