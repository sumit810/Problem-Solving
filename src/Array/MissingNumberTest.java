package Array;

import java.util.Scanner;

public class MissingNumberTest {
	public static void main(String... s) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int N = scan.nextInt();
		int[] arr = new int[N];
		System.out.println("Elements in an Array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		// int result = findingMissingNumberInArray(arr, N);
		findingMisingNumberInArrayHavingDuplicates(arr);
		// System.out.println("Missing Number is : " + result);

	}

	private static void findingMisingNumberInArrayHavingDuplicates(int[] arr) {
		// create a new temporary Array
		int[] tempArray = new int[arr.length];
		/*
		 * iterate over given array to mark all present numbers in our tempArray
		 * array
		 */
		for (int x : arr) {
			tempArray[x] = 1;
		}

		System.out.println("Missing Numbers are as follows:");
		for (int i = 1; i < tempArray.length; i++) {
			if (tempArray[i] == 0) {
				System.out.println(i + " ");
			}
		}

	}

	private static int findingMissingNumberInArray(int[] arr, int n) {
		int missingNumber = 0;
		int sumArray = 0;
		int sum = (n * (n + 1)) / 2;
		for (int i = 0; i < arr.length; i++) {
			sumArray = sumArray + arr[i];
		}
		missingNumber = sum - sumArray;
		return missingNumber;
	}

}
