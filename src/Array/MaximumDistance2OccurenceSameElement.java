package Array;

import java.util.Scanner;

/*Maximum distance between two occurrences of same element in array*/

public class MaximumDistance2OccurenceSameElement {
	public static void main(String... s) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Elements in an Array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int result = maximumDistanceBetween2OccurrnceSameElement(arr, n);
		System.out.println("Maximum Distance:" + result);
	}

	private static int maximumDistanceBetween2OccurrnceSameElement(int[] arr, int n) {
		int maxDistance = arr[0];
		int maxDist = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j >= 0; j--) {
				if (arr[i] == arr[j]) {
					maxDist = Math.abs(arr[i] - arr[j]);
				}
			}
			if (maxDistance > maxDist) {
				maxDist = maxDistance;
			}

		}
		return maxDist;
	}

}
