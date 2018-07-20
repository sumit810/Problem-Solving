package StringHandling;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*Two strings are given and you have to modify 1st string such that all the common characters of the 
 * 2nd strings have to be removed and the uncommon characters of the 2nd string have to be concatenated with uncommon characters of the 1st string.

Examples:

Input : S1 = "aacdb"
        S2 = "gafd"
Output : "cbgf"

Input : S1 = "abcs";
        S2 = "cxzca";
Output : "bsxz"*/

class ConcatenatedStringUncommonCharacters {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a first String");
		String str1 = scan.nextLine();
		System.out.println("\nEnter a second string");
		String str2 = scan.nextLine();
		scan.close();
		concatenatedStringWithUncommonCharacters(str1, str2);

	}

	private static void concatenatedStringWithUncommonCharacters(String str1, String str2) {
		char ch1Array[] = str1.toCharArray();
		char ch2Array[] = str2.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str1.length(); i++) {
			if (map.containsKey(ch1Array[i])) {
				map.put(ch1Array[i], map.get(ch1Array[i]));
			} else {
				map.put(ch1Array[i], 1);
			}
		}
		for (int j = 0; j < str2.length(); j++) {
			if (!map.containsKey(ch2Array[j])) {
				map.put(ch2Array[j], 1);
			} else {
				map.put(ch2Array[j], 2);
			}
		}
		map.forEach((k, v) -> {
			if (v.equals(1)) {
				System.out.print(k);
			}
		});

	}

}
