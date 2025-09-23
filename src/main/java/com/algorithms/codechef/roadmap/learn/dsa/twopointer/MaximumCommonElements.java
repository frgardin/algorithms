package com.algorithms.codechef.roadmap.learn.dsa.twopointer;

import java.util.Scanner;
import java.util.Arrays;

public class MaximumCommonElements {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while (t-->0) {
			int n= sc.nextInt();
			
			int[] a = new int[n];
			int[] b = new int[n];
			
			for (int i=0;i<n;i++) a[i]=sc.nextInt();
			for (int i=0;i<n;i++) b[i]=sc.nextInt();
			
			int ans = 0;
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			int ia = 0;
			int ib = 0;
			
			while (ia <n && ib < n) {
				if (a[ia] == b[ib]) {
					ia++;
					ib++;
					ans++;
				} else if(a[ia] > b[ib]) {
					ib++;
				} else {
					ia++;
				} 
			}
			System.out.println(ans);
		}
		
		sc.close();
	}
}
