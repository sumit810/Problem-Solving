package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


//O(n) complexity using Hashmap

public class RemoveDuplicates {
	public static void main(String... s){
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("Enter the value of n:");
		n = scan.nextInt();
		System.out.println("Elements are as:-");
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i] = scan.nextInt();
		}
		removeDuplicatesByHashMap(arr,n);
		
	}

	private static void removeDuplicatesByHashMap(int[] arr, int n) {
		// TODO Auto-generated method stub
		int count=0;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
				count++;
			}else{
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
		System.out.println("Total Number of duplicates: " + count);
		
		System.out.println("Array after Removal of Duplicates:");
		map.forEach((key,value)->{
			System.out.print(" " +key);
		});
	}

}
