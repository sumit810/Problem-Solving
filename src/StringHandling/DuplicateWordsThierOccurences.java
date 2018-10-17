package StringHandling;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

// To find the duplicate words and their number of occurrences in a string

public class DuplicateWordsThierOccurences {
	public static void main(String... s) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str = scan.nextLine();
		findDuplicateWordsAndOccurrences(str);
	}

	private static void findDuplicateWordsAndOccurrences(String str) {
		String[] words = str.split(" ");
		Map<String, Integer> wordCountMap = new HashMap<String, Integer>();
		for (String strs : words) {
			if (wordCountMap.containsKey(strs)) {
				wordCountMap.put(strs, wordCountMap.get(strs) + 1);
			} else {
				wordCountMap.put(strs, 1);
			}
		}
		// Extracting all the keys from map
		Set<String> wordsString = wordCountMap.keySet();
		System.out.println("Duplicate word with number of occurrences!");
		for (String newWords : wordsString) {
			if (wordCountMap.get(newWords) > 1) {
				System.out.println(newWords + " is repeated " + wordCountMap.get(newWords) + " times.");
			}
		}
	}

}
