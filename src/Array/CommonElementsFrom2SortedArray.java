package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CommonElementsFrom2SortedArray {
	public static void main(String... s) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		int[] a = new int[n];
		System.out.println("Array A:");
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("Enter the value of m");
		int m = scan.nextInt();
		int[] b = new int[m];
		System.out.println("Array B:");
		for (int i = 0; i < b.length; i++) {
			b[i] = scan.nextInt();
		}
		Integer[] result = commonElementsFrom2SortedArrays(a, b);
		System.out.println("Common Elements between 2 Sorted Arrays:");
		System.out.println(Arrays.toString(result));
	}

	private static Integer[] commonElementsFrom2SortedArrays(int[] a, int[] b) {
		// TODO Auto-generated method stub
		int x = 0;
		int y = 0;
		List<Integer> list = new ArrayList<Integer>();
		while (x < a.length && y < b.length) {
			if (a[x] == b[y]) {
				list.add(a[x]);
				x++;
				y++;
			} else if (a[x] > b[y]) {
				y++;
			} else {
				x++;
			}
		}
		// Convert the result to a regular array
		Integer[] arr = new Integer[list.size()];
		return list.toArray(arr);
	}

}
