package ZohoTest;

//import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//import java.util.Scanner;

public class ArrayPermutation {
	

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//int n=sc.nextInt();
		int[] arr1 = {1,2,5,4,0};//new int[n];
		int[] arr2 = {2,4,5,0,1};//new int[n];
		/*for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			arr2[i]=sc.nextInt();
		}*/
		Map<Integer, Integer> map1 = new HashMap<>();
		Map<Integer, Integer> map2 = new HashMap<>();
		
		for (int i=0; i<arr1.length; i++) {
			map1.put(arr1[i], map1.getOrDefault(arr1[i], 0) + 1);
			map2.put(arr2[i], map2.getOrDefault(arr2[i], 0) + 1);
		}
		
		if (map1.equals(map2)) {
			System.out.println("Equals");
		} else {
			System.out.println("Not Equals");
		}
	}

}
