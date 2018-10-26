package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class findingCommonElementsFrom2Arrays {
	public static void main(String... s) throws Exception {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of m");
		int m = scan.nextInt();
		int[] arr1 = new int[m];
		System.out.println("Elements in array");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = scan.nextInt();
		}
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		int[] arr2 = new int[n];
		System.out.println("Array 2:");
		for (int j = 0; j < arr2.length; j++) {
			arr2[j] = scan.nextInt();
		}
		findingCommonElementsIn2Array(arr1, arr2);
	}

	private static void findingCommonElementsIn2Array(int[] arr1, int[] arr2) throws Exception {
		int arrLen1 = arr1.length;
		int arrLen2 = arr2.length;

		// corner case
		if (arrLen1 > arrLen2) {
			throw new Exception("Array 1 length should not be greater than Array 2");
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr1.length; i++) {
			if (map.containsKey(arr1[i])) {
				map.put(arr1[i], map.get(arr1[i]) + 1);
			} else {
				map.put(arr1[i], 1);
			}
		}
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr2.length; i++) {
			if (map.containsKey(arr2[i])) {
				list.add(arr2[i]);
			} else {
				continue;
			}
		}
		System.out.println("Common Elements in both the Arrays");
		System.out.println(list);
	}

}
