package Array;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String... s) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Elements in Array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		reverseArray(arr, n);
		// reverseArrayByLoop(arr, n);
		System.out.println("Reverse of the Array:");
		print(arr);
	}

	private static void reverseArrayByLoop(int[] arr, int n) {
		// TODO Auto-generated method stub
		for (int i = n - 1; i >= 0; i--) {
			System.out.println(arr[i] + " ");
		}

	}

	private static void print(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void reverseArray(int[] arr, int n) {
		// TODO Auto-generated method stub
		int i = 0, j = n - 1;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

	}

}
