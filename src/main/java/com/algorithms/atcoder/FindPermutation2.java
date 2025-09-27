package com.algorithms.atcoder;

import java.util.*;
public class FindPermutation2 {
	
	  
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    
	    int[] a = new int[n];
	    HashSet<Integer> hs = new HashSet<>(n);
	    HashSet<Integer> hs2= new HashSet<>(n);
	    
	    
	    for (int i =0;i<n;i++) {
	      hs2.add(i+1);
	      int j=sc.nextInt();
	      a[i]=j;
	      if (j != -1) {
	        if (hs.contains(j)) {
	          System.out.print("No");
	          return;
	        }
	        hs.add(j);
	      }
	    }
	    
	    
	    
	    hs2.removeAll(hs);
	    
	    Iterator<Integer> it = hs2.iterator();
	    
	    StringBuilder sb = new StringBuilder();
	    
	    for (int i : a) {
	      if (i == -1 && it.hasNext()) {
	        sb.append(it.next());
	      } else if (i == -1) {
	        System.out.print("No");
	        return;
	      } else {
	        sb.append(i);
	      }
	      sb.append(' ');
	    }
	    System.out.println("Yes");
	    System.out.println(sb);
	  }
	
}
