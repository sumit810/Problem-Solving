package Array;

import java.util.Arrays;
import java.util.Scanner;

public class LeftArrayRotation {
	public static void main(String... s) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Array A:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the value of d; array rotated by 'd' times");
		int d = scan.nextInt();
		for (int i = 0; i < d; i++) {
			leftRotateArrayByOne(arr, n);
		}
		System.out.println("Left Array Rotation");
		System.out.println(Arrays.toString(arr));
	}

	//O(n) solution
	private static void leftRotateArrayByOne(int[] arr, int n) {
		// TODO Auto-generated method stub
		int temp = arr[0];
		for (int i = 0; i < n - 1; i++) {
			//move each element of an array to the left 
			arr[i] = arr[i + 1];
		}
		//copy the first element to the last position
		arr[n - 1] = temp;

	}

}
