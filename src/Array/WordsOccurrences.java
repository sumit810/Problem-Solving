package Array;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordsOccurrences {
	public static void main(String... s) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a given String");
		String str = scan.nextLine();
		findOccurrenceWords(str);

	}

	static void findOccurrenceWords(String str) {
		String[] words = str.split(" ");
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (String strs : words) {
			if (map.get(strs) != null) {
				map.put(strs, map.get(strs) + 1);
			} else {
				map.put(strs, 1);
			}
		}

		Iterator<String> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			String temp = itr.next();
			if (map.get(temp) > 1) {
				System.out.println("The word " + temp + " is repeated  " + map.get(temp) + " times.");
			}

		}
	}

}
