package StringHandling;

import java.util.Scanner;

public class IsPalindrome {
	public static void main(String... s) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.nextLine();
		//boolean isPalindrome = IsPalindrome(str);
		boolean isPalindrome = IsPalindromeByStringBuffer(str);
		if (isPalindrome) {
			System.out.println("String is a palindrome!");
		} else {
			System.out.println("String is a not a palindrome!");
		}
	}

	private static boolean IsPalindromeByStringBuffer(String str) {
		// TODO Auto-generated method stub
		boolean isPalindrome = false;
		String tempString =new  StringBuffer(str).reverse().toString();
		if(str.equals(tempString)){
			isPalindrome = true;
		}else{
			isPalindrome = false;
		}		
		return isPalindrome;
	}

	private static boolean IsPalindrome(String str) {
		boolean isPalindrome = false;
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		if (str.equals(reverse)) {
			isPalindrome = true;
		} else {
			isPalindrome = false;
		}
		return isPalindrome;
	}

}
