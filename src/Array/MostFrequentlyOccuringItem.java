package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentlyOccuringItem {
	public static void main(String... s) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Elements in an array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		mostFrequentlyOccuringItem(arr);	
	}
	private static void mostFrequentlyOccuringItem(int[] arr) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
		int mostFrequentlyUsedInteger = 0;
		int theDigit = 0;
		for (Integer digit : map.keySet()) {
			Integer theVal = map.get(digit);
			if (theVal > mostFrequentlyUsedInteger) {
				mostFrequentlyUsedInteger = theVal;
				theDigit = digit;
			}
		}
		System.out.println("The most frequently digit is: " + theDigit);
	}

}
