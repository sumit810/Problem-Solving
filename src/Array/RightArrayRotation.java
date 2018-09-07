package Array;

import java.util.Arrays;
import java.util.Scanner;

public class RightArrayRotation {
	public static void main(String... s) {
		@SuppressWarnings("resource")
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
		rotateArrayRightByDShifts(arr, n, d);
		rotateArrayRightByDShiftsByOrder1(arr,n,d);
		System.out.println("Right Array Rotation");
		System.out.println(Arrays.toString(arr));
	}

	private static void rotateArrayRightByDShiftsByOrder1(int[] arr, int n, int d) {
		// TODO Auto-generated method stub
		
		
		
	}

	private static void rotateArrayRightByDShifts(int[] arr, int n, int d) {
		// TODO Auto-generated method stub
		if(arr == null || d<0){
			throw new IllegalArgumentException("Array must not be null and d should not negative");
		}
		for (int i = 0; i < d; i++) {
			rotateRightByOne(arr, n);
		}
	}

	//O(n) solution
	private static void rotateRightByOne(int[] arr, int n) {
		// TODO Auto-generated method stub
		int temp = arr[n - 1];
		for (int i = n - 1; i>0; i--) {
			// move each element to the right
			arr[i] = arr[i - 1];
		}
		// copy the last element to the first position
		arr[0] = temp;
	}
}