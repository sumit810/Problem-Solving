package Array;

import java.util.Scanner;

public class BinaryRepresentation {
	public static void main(String... a) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number!");
		int num = scan.nextInt();
		binaryRepresentation(num);
		scan.close();
	}

	private static void binaryRepresentation(int num) {
		int[] binary = new int[25];
		int index = 0;
		while (num != 0) {
			binary[index] = num % 2;
			num /= 2;
			index++;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i] + " ");
		}
		countNumberOfOnes(binary);
	}

	private static void countNumberOfOnes(int[] binary) {
		int count = 0;
		for (int i = 0; i < binary.length; i++) {
			if (binary[i] == 1) {
				count++;
			}
		}
		System.out.println("\nNo of 1's is :" + count);
	}

}
