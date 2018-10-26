package StringHandling;

import java.util.Scanner;

public class ReverseWords {
	public static void main(String... s) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.nextLine();
		System.out.println(reverseWordsInStrings(str));
		// System.out.println(reverseWordsInStringsByReversing(str));
	}

	private static String reverseWordsInStringsByReversing(String str) {
		String result = " ";
		String[] newWords = str.split(" ");
		for (int i = newWords.length - 1; i >= 0; i--) {
			result = result + " " + newWords[i];
		}
		return result;
	}

	private static String reverseWordsInStrings(String str) {
		String[] words = str.split(" ");
		String reverse = " ";
		for (int i = 0; i < words.length; i++) {
			if (i == words.length - 1)
				reverse = words[i] + reverse;
			else
				reverse = " " + words[i] + reverse;
		}
		return reverse;
	}

}
