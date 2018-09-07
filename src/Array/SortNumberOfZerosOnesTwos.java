package Array;

import java.util.Scanner;

//By doing simple counting O(N)

public class SortNumberOfZerosOnesTwos {
	public static void main(String... s) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Elements in Array: should be 0, 1 & 2");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		sortZerosTwosAndOnes(arr);
		System.out.println("Sorted Array: with 0's,1's and 2's");
		printArray(arr);

	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void sortZerosTwosAndOnes(int[] arr) {
		int count1s = 0;
		int count0s = 0;
		int count2s = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count0s++;
			}
			if (arr[i] == 1) {
				count1s++;
			}
			if (arr[i] == 2) {
				count2s++;
			}
		}

		// put all zero's to the start of the array
		for (int i = 0; i < count0s; i++) {
			arr[i] = 0;
		}
		// put all one's after the zero's in the array
		for (int i = count0s; i < count0s + count1s; i++) {
			arr[i] = 1;
		}
		for (int i = (count0s + count1s); i < (count0s + count1s + count2s); i++) {
			arr[i] = 2;
		}

	}

}
