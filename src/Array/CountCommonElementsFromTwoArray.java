package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Given two arrays A[] and B[] consisting of n and m elements respectively. Find minimum number of elements to remove from each array such that no common element exist in both.

Examples:

Input : A[] = { 1, 2, 3, 4}
        B[] = { 2, 3, 4, 5, 8 }
Output : 3
We need to remove 2, 3 and 4 from any array.

Input : A[] = { 4, 2, 4, 4}
        B[] = { 4, 3 }
Output : 1
We need to remove 4 from from B[]

Input : A[] = { 1, 2, 3, 4 }
        B[] = { 5, 6, 7 }
Output : 0
There is no common element in both.
*/
public class CountCommonElementsFromTwoArray {
	public static void main(String... s){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements in array A:");
		for(int i=0;i<a.length;i++){
			a[i] = scan.nextInt();
		}
		System.out.println("Enter the value of m");
		int m = scan.nextInt();
		int[] b = new int[m];
		System.out.println("Enter the eleemnts in array B:");
		for(int i=0;i<b.length;i++){
			b[i] = scan.nextInt();
		}
		countCommonElemenetsWithinArraysByMap(a,b);
		
	}

	private static void countCommonElemenetsWithinArraysByMap(int[] a, int[] b) {
		int count =0;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++){
			if(map.containsKey(a[i])){
				map.put(a[i], map.get(a[i]));
			}else{
				map.put(a[i], 1);
			}
		}
		for(int j=0;j<b.length;j++){
			if(!map.containsKey(b[j])){
				map.put(b[j], map.get(b[j]));
			}else{
				map.put(b[j], 2);
			}
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			if(map.get(entry.getKey())!=null) {
				if(map.get(entry.getKey()) > 1){
					count++;
				}	
			}
		}
		System.out.println(count);
	}

}
