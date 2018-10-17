package Hashing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Given an array A[] and a number x, check for pair in A[] with sum as x

public class ExistCheckSumArrayComprises {
	public static void main(String... d) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Elements in array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the given Sum");
		int sum = scan.nextInt();
		pairCheckSuComprises(arr, sum);
		//pairCheckSumComprisesUsing2ForLoops(arr, sum);
	}

	private static void pairCheckSumComprisesUsing2ForLoops(int[] arr, int sum) {
		int i,j;
		for(i=0;i<arr.length;i++){
			for(j=i+1;j<arr.length-1;j++){
				if(arr[i]+arr[j] == sum){
					break;
				}
			}	
		}
		
	}

	private static void pairCheckSuComprises(int[] arr, int sum) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			int x = sum - arr[i];
			if (x >= 0 && set.contains(x)) {
				System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", " + x + ")");
			}
			set.add(arr[i]);
		}

	}

}
