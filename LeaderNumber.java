package ZohoTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//import java.util.Scanner;

public class LeaderNumber {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		
		int n= 6; //sc.nextInt();
		int[] arr = {16,17,4,3,5,2};//new int[n];
		/*for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}*/
		int max=arr[n-1];
		List<Integer> list = new ArrayList<>();
		list.add(max);
		for(int i=arr.length-2; i>=0; i--) {
			if(arr[i]>arr[i+1] && arr[i]>max) {
				list.add(arr[i]);
			}
			max=Math.max(max, arr[i]);
		}
		Collections.reverse(list);
		System.out.println(list);
	}

}
