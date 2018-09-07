package StringHandling;

import java.util.Scanner;

public class FindingAllSubstrings {
	public static void main(String... s) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.next();
		System.out.println("Substrings are as:");
		findingAllSbstrings(str);
	}

	private static void findingAllSbstrings(String str) {
		// TODO Auto-generated method stub
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}
}
