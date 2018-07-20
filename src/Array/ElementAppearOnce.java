package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ElementAppearOnce {
	public static void main(String... s) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Elements in array:-");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		findElementAppersOnce(arr);
	}

	private static void findElementAppersOnce(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		System.out.println("Element that appears only once is:");
		map.forEach((k, v) -> {
			if (v.equals(1)) {
				System.out.print(k);
			} else {
				System.out.print("No element found!");
			}
		});
	}
}
