package Array;

import java.util.Scanner;

/*
 * Left Array Rotation
Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
*/

public class RotateArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in an array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the value of d");
		int d = scan.nextInt();
		scan.close();
		leftRotateArrayDtimes(arr,d);
		System.out.println("Resultant Output after rotating left by " + d + " times!.");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void leftRotateArrayDtimes(int[] arr,int d) {
		for (int i = 0; i < d; i++) {
			rotateArrayByOne(arr);
		}
	}

	private static void rotateArrayByOne(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length-1; i++) {
			arr[i] = arr[i + 1];
			arr[i+1] = temp;
		}
	}

}
