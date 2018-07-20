package Array;

import java.util.Scanner;

public class RightArrayRotation {
	public static void main(String... a) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in an array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the value of d:");
		int d = scan.nextInt();
		scan.close();
		rightArrayRotateDtimes(arr, d, n);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void rightArrayRotateDtimes(int[] arr, int d, int n) {
		for (int i = 0; i < d; i++) {
			rotateArrayByOne(arr, n);
		}
	}

	private static void rotateArrayByOne(int[] arr, int n) {
		int temp = n - 1;
		for (int i = n-1; i > 0; i--) {
			arr[i] = arr[i-1];
			arr[i-1] = temp;
		}
	}
}
