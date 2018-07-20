package BitwiseManipulation;

import java.util.Scanner;

public class Power2 {
	public static void main(String[] a){
		Scanner scan = new 	Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scan.nextInt();
		boolean result = checkNumberPowerOf2(num);
		scan.close();
		System.out.println(result);
	}

	private static boolean checkNumberPowerOf2(int num) {
		boolean check = true;
		if(num!=0){
			check = (num & (num-1)) ==0;
		}
		return check;
		
	}

}
