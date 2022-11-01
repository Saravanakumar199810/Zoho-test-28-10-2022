package ZohoTest;

import java.util.HashMap;
import java.util.Scanner;

public class RepeatedElement {

	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt(),val,count=0,ans=0;
		
		for(int i=0;i<n;i++) {
			val=sc.nextInt();
			if(hm.containsKey(val)) {
				hm.put(val, hm.get(val)+1);
				if(hm.get(val)==k && count==0) {
					ans=val;
					count++;
				}
			}
			else {
				hm.put(val, 1);
			}
		}
		System.out.println(ans);
		
	}

}

/*
 * 7 2 
 * 1 7 4 3 4 8 7
 */