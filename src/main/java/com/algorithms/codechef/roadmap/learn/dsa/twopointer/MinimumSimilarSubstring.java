package com.algorithms.codechef.roadmap.learn.dsa.twopointer;

import java.util.*;

public class MinimumSimilarSubstring {

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		sc.nextLine();
		
		String s = sc.nextLine();
		String t = sc.nextLine();
		
		
		int[] arrS = new int[26];
		HashMap<Character, Integer> m1 = new HashMap<>(n);
		HashMap<Character, Integer> m2 = new HashMap<>(m);
		
		
		for (char c : s.toCharArray()) {
		    m1.put(c, m1.getOrDefault(c,0)+1);
		}
		
		for (char c : t.toCharArray()) {
		    m2.put(c, m2.getOrDefault(c,0)+1);
		}
		
		for (char c : t.toCharArray()) {
		    if (m2.get(c) > m1.get(c)) {
		        System.out.println("IMPOSSIBLE");
		        return;
		    } 
		}
		
		int l=0;
		int r=0;
		
		while (l<=r) {
		    // TODO
		}
		
		sc.close();
	}
}
