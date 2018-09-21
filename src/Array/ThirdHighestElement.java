package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdHighestElement {
	public static void main(String... s) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Elements in an Array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		printThirdHighestNumber(arr, n);

	}

	private static void printThirdHighestNumber(int[] arr, int n) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		System.out.println("Third Highest Element");
		System.out.println(arr[n-3]);
	}

}
