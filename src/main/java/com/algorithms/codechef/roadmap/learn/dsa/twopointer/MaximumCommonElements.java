package com.algorithms.codechef.roadmap.learn.dsa.twopointer;

import java.util.Scanner;

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
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (a[i] == b[j]) ans++;
				}
			}
			System.out.println(ans);
		}
		
		sc.close();
	}
}
