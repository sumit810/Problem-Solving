package StringHandling;

import java.util.Scanner;

/*Given a string s, make a list of all possible combinations of letters of a given string S. If there are two strings with the same set of characters, print the lexicographically smallest arrangement of the two strings

For string abc, the list in lexicographic order subsequences are, a ab abc ac b bc c

Examples:

Input : s = "ab"
Output : a ab b

Input  : xyzx
Output : x xx xy xyx xyz xyzx xz xzx y
         yx yz yzx z zx*/

public class LexicographicOrderString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
		scan.close();
		stringLexicographicOrder(str);

	}

	private static void stringLexicographicOrder(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j<str.length();j++) {
				String st = str.substring(i, j);
				System.out.print(st+" ");
			}
		}

	}

}
