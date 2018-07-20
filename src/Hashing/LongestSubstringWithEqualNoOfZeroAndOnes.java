package Hashing;

import java.util.HashMap;
import java.util.Scanner;

class LongestSubstringWithEqualNoOfZeroAndOnes {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[] = new String[n];
		for(int i = 0; i < n; i++) {
		    arr[i] = sc.next();
		}
		
		for(String s : arr) {
		    System.out.println(findLargest(s));
		}
	}
	
	public static int findLargest(String s) {
	    int largest = -1;
	    int sum = 0;
	    int arr[] = new int[s.length()];
	    
	    for(int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);
	        if(c == '1') {
	            sum++;
	        }
	        else {
	            sum--;
	        }
	        arr[i] = sum;
	    }
	    HashMap<Integer, Integer> map = new HashMap<>();
	    map.put(0, -1);
	    for(int i = 0; i < arr.length; i++) {
	        if(map.containsKey(arr[i])) {
	            int diff = i - map.get(arr[i]);
	            if(diff > largest) {
	                largest = diff;
	            }
	        }
	        else {
	            map.put(arr[i], i);
	        }
	    }
	    
	    return largest;
	    
	}
}