package Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class LengthSortComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		if (o1.length() != o2.length()) {
			return o1.length() - o2.length();
		} else {
			return o1.compareTo(o2);
		}
	}

}

public class SortingTheString {
	@SuppressWarnings("unchecked")
	public static void main(String... s) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.nextLine();
		String[] words = str.toLowerCase().split(" ");
		Arrays.sort(words, new LengthSortComparator());
		System.out.println("After Sorting:");
		System.out.println(Arrays.deepToString(words));

	}

}
