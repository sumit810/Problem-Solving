package BitwiseManipulation;

import java.util.Scanner;

public class CountNumberOfOnesInANumber {
	public static void main(String...  a){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		int result = countNumberOfOnes(num);
		scan.close();
		System.out.println("Number of ones in a binary representation of a number is: " +result);
	}

	private static int countNumberOfOnes(int num) {
		int count =0;
		while(num!=0){
			num = num & (num-1);
			count++;
		}
		return count;
	}

}
