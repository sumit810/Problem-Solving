package StringHandling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*Given a string ‘str’, the task is to find whether the vowels in the string are in alphabetical order or not. The string contains only lowercase alphabets.

Examples:

Input: str = "aabbbddeecc"
Output: Vowels are in alphabetical order
The vowel characters in the string are : a, a, e, e 
which are in sorted order.

Input: str = "aabbbdideecc"
Output: Vowels are not in alphabetical order*/

public class VowelsInAlphabeticalOrder {
	public static void main(String... d) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.next();
		boolean result = IsVowelsAlphabeticalOrder(str);
		if (result) {
			System.out.println("Vowels are in alphabetical order");
		} else {
			System.out.println("Vowels are not in alphabetical order");
		}
	}

	private static boolean IsVowelsAlphabeticalOrder(String str) {
		boolean isOrder = false;
		char[] characters = str.trim().toCharArray();

		final List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		List<Integer> vowelStored = new ArrayList<>();

		int lastVowelIndex = 0;
		// traverse each and every character of the String
		for (Character character : characters) {
			// find all the vowels among these characters
			if ((character.equals('a')) || (character.equals('e')) || (character.equals('i')) || (character.equals('o'))
					|| (character.equals('u'))) {
				int lookupIndex = vowels.indexOf(character);
				if (-1 != lookupIndex) {
					if (lookupIndex < lastVowelIndex) {
						isOrder = false;
						return isOrder;
					} else {
						lastVowelIndex = lookupIndex;
						vowelStored.add(lastVowelIndex);
					}
				}
			}
		}
		for (int i = 1; i < vowelStored.size(); i++) {
			if (vowelStored.get(i - 1) <= vowelStored.get(i))
				isOrder = true;
			return isOrder;
		}
		return isOrder;
	}

}
