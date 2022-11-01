package ZohoTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MaxSubArray {

	public static void main(String[] args) {
		int n=8;
		int[] a={15,2,-2,-8,1,7,10,23};
		Map<Integer, List> map = new HashMap<>();
		List<Integer> list;
		for(int i=0; i<n; i++) {
			int sum=0, count=0;
			for(int j=i; j<n; j++) {
		        sum+=a[j];
		        count++;
		        if(sum==0) {
		        	list=new ArrayList<>();
		        	for(int k=i; k<=j; k++) {
		        		list.add(a[k]);
		        	}
		        	map.put(count, list);
		        }
			}
		}
		int val = Collections.max(map.keySet());
		System.out.println(map.get(val));
		System.out.println(val);
	}

}
//8
//15, -2, 2, -8, 1, 7 , 10, 23
