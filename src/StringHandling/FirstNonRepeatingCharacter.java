package StringHandling;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
	public static void main(String... s) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.nextLine();
		System.out.println("The first Non-Repeating Character is :");
		// System.out.println(findfirstNonRepeatedCharacter(str));
		System.out.println(findFirstNonRepeatingCharacterByHashMap(str));
	}

	private static char findFirstNonRepeatingCharacterByHashMap(String str) {
		char[] characters = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(characters[i])) {
				map.put(characters[i], map.get(characters[i]) + 1);
			} else {
				map.put(characters[i], 1);
			}
		}

		for (int i = 0; i < str.length(); i++) {
			char newChars = str.charAt(i);
			if (map.get(newChars) == 1) {
				return newChars;
			}
		}
		throw new RuntimeException("didn't find any non repeated Character");
	}

	private static char findfirstNonRepeatedCharacter(String str) {
		char[] characters = str.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(characters[i])) {
				map.put(characters[i], map.get(characters[i]) + 1);
			} else {
				map.put(characters[i], 1);
			}
		}

		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		throw new RuntimeException("didn't find any non repeated Character");
	}

}
