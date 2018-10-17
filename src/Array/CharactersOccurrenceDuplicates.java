package Array;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharactersOccurrenceDuplicates {
	public static void main(String... s) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
		findingCharacterOccurrencesWithDuplicates(str);
	}

	private static void findingCharacterOccurrencesWithDuplicates(String str) {
		char[] ch = str.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (Character chracter : ch) {
			if (map.containsKey(chracter)) {
				map.put(chracter, map.get(chracter) + 1);
			} else {
				map.put(chracter, 1);
			}
		}

		Iterator<Character> itrChar = map.keySet().iterator();
		while (itrChar.hasNext()) {
			Character tempCharacter = itrChar.next();
			if (map.get(tempCharacter) > 1) {
				System.out.println(
						"The Character " + tempCharacter + " is repeated " + map.get(tempCharacter) + " times.");
			}
		}
	}

}
