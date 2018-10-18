package StringHandling;

import java.util.Arrays;
import java.util.Scanner;

public class CheckingAnagram {
	public static void main(String... s) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first String");
		String str1 = scan.next();
		System.out.println("Enter the second String");
		String str2 = scan.next();
		/* boolean checkAnagram = IsAnagrams(str1, str2); */
		boolean checkAnagram = IsAnagramsByUsingSubstring(str1, str2);
		if (checkAnagram) {
			System.out.println(str1 + " is anagram to " + str2);
		} else {
			System.out.println("Both strings are not Anagrams to each other!");
		}

	}

	private static Boolean IsAnagramsByUsingSubstring(String str1, String str2) {
		boolean isAnagram = false;
		int len1 = str1.length();
		int len2 = str2.length();
		if (len1 != len2) {
			isAnagram = false;
		}

		/*
		 * convert first String into characters and check if each character of
		 * first String matches with String two if it matches; deletes the
		 * second string and if the string2 is empty it means all characters
		 * matches to first string
		 */
		char[] charAray1 = str1.trim().toCharArray();

		for (Character ch : charAray1) {
			int index = str2.indexOf(ch);
			if (index != -1) {
				str2 = str2.substring(0, index) + str2.substring(index + 1);
			} else {
				isAnagram = false;
			}
		}
		isAnagram = str2.isEmpty();
		return isAnagram;
	}

	private static boolean IsAnagrams(String str1, String str2) {
		boolean isAnagram = false;
		int len1 = str1.length();
		int len2 = str2.length();

		char[] charArray1 = str1.trim().toCharArray();
		char[] charArray2 = str2.trim().toCharArray();
		if (len1 != len2) {
			isAnagram = false;
		} else {
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			return Arrays.equals(charArray1, charArray2);
		}
		return isAnagram;
	}

}
