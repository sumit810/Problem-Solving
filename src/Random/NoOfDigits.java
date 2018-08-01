package Random;

import java.util.Scanner;

public class NoOfDigits {
	public static void main(String... a) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		// Approach 1
		int result = findingNoOfDigits(num);
		// Approach 2
		int result2 = findingNoOfDigitsByConvertingIntoString(num);
		// Approch 3
		int result3 = findingNoOfDigitsByLog(num);
		System.out.println("Number of digits are : ");
		// System.out.println(Integer.toString(result2));
		// System.out.println(Integer.toString(result));
		System.out.println(Integer.toString(result3));

	}

	private static int findingNoOfDigitsByLog(int num) {
		// TODO Auto-generated method stub
		return (int) (Math.log10(num) + 1);
	}

	private static int findingNoOfDigitsByConvertingIntoString(int num) {
		// TODO Auto-generated method stub
		String str1 = String.valueOf(num);
		return str1.length();
	}

	private static int findingNoOfDigits(int num) {
		// TODO Auto-generated method stub
		int rem, count = 0;
		while (num != 0) {
			rem = num % 10;
			num = num / 10;
			count++;
		}
		return count;
	}

}
